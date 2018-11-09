package initializer;

import servlet.UsefulServlet;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;

/**
 * Created by Administrator on 2018/1/9.
 */
@HandlesTypes({UsefulServlet.class})
public class myFirst implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        System.out.println("onStartup");
        ServletRegistration registration=servletContext.addServlet("UsefulServlet","servlet.UsefulServlet");
        registration.addMapping("/useful");
        System.out.println("Leaving onStartup");
    }
}
