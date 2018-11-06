/**
 * Created by Administrator on 2017/10/13.
 */import org.apache.log4j.Logger;

import java.io.File;
import java.util.Iterator;

public class Demo {
    static final Logger LOGGER=Logger.getLogger(Demo.class);
        public void ddd(){
            MyFirst o=new MyFirst();
            o.setName("111");
    }

    public static void main(String[] args) {
       /* MyFirst o=new MyFirst();
        o.setName("111");
        try {
            o.setAge(10);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println(Math.pow(2,2.2));
        System.out.println(o);

        try {
            LOGGER.debug("请输入正确的年龄");
            o.setAge(10);

        }catch (IllegalArgumentException e){
            LOGGER.info(e.getMessage());
        }*/
      /* Double a;
       int b=65;
       double c=-13;
       a=c%b;
        System.out.println(a);*/
        File file1=new File("e:\\abc");
        System.out.println(file1);
        File file2=new File(file1,"adb.txt");
        System.out.println(file2);
        file1.mkdir();
        String path=file1.getPath();

    }
}
