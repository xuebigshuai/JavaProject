package com.xys.controller.product;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2018/1/12.
 */
public class InputProductController implements Controller {

    private static final Log logger= LogFactory.getLog(InputProductController.class);
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
            logger.info("InputProductController called");
            ModelAndView modelAndView=new ModelAndView();
            /*modelAndView.setViewName("/WEB-INF/jsp/product/ProductForm.jsp");*/
        modelAndView.setViewName("product/ProductForm");
        return modelAndView;
    }
}
