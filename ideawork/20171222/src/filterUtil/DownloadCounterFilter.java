package filterUtil;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Administrator on 2017/12/22.
 */
/*@WebFilter(filterName = "DownloadCounterFilter" ,urlPatterns = {"*//*"})*/
public class DownloadCounterFilter implements Filter {
    ExecutorService executorService= Executors.newSingleThreadExecutor();
    Properties downloadLog;
    File logFile;
    public void destroy() {
        executorService.shutdown();
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletResponse response= (HttpServletResponse) resp;
        HttpServletRequest request= (HttpServletRequest) req;
        /*获取应用程序的相对路径*/
        String path = request.getContextPath();
        System.out.println(path+"路径路径");
        final  String uri=request.getRequestURI();
        System.out.println("++++++++++++++"+uri);
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                String property=downloadLog.getProperty(uri);
                if(property==null){
                    downloadLog.setProperty(uri,"1");
                }else{
                    int count=0;
                    count=Integer.parseInt(property);
                    count++;
                    downloadLog.setProperty(uri,Integer.toString(count));
                }
                try {
                    downloadLog.store(new FileWriter(logFile),"");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });


        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("DowloadCounterFilter");
        String appPath=config.getServletContext().getRealPath("/");
        System.out.println(appPath);
        logFile=new File(appPath,"downloadFilter.txt");
       /* try {
            Class clz=Class.forName("DownloadCounterFilter");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/
        if(!logFile.exists()){
            try {
                logFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        downloadLog=new Properties();
        try {
            downloadLog.load(new FileReader(logFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
