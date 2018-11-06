package servlet;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Suresh on 2018/1/3.
 */
@WebServlet(name = "AsyncCompleteServlet",urlPatterns = {"/asyncComplete"},asyncSupported =true)
public class AsyncCompleteServlet extends HttpServlet {
    private static   final  long serialVersionUID=78234L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        final PrintWriter writer=response.getWriter();
        writer.println("<html><head><title>AsyncCompleteServlet</title></head>");
        writer.println("<body><div id='progress'></div>");
        final AsyncContext asyncContext=request.startAsync();
        asyncContext.setTimeout(50000);
        asyncContext.start(new Runnable() {
            @Override
            public void run() {
                System.out.println("new Threaf:"+Thread.currentThread());
                for (int i = 0; i < 10; i++) {
                    writer.println("<script> document.getElementById('progress').innerHTML='"+(i*10)+"% Complete'");
                    writer.println("</script>");
                    writer.flush();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                writer.println("<script>  document.getElementById('progress').innerHTML='DONE' </script></body></html>");
                asyncContext.complete();
            }
        });
        response.setCharacterEncoding("utf-8");
        writer.println("你好，我在百分百完成的后面！");

    }
}
