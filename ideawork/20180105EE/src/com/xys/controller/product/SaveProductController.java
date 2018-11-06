package com.xys.controller.product;

import com.xys.model.Product;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2018/1/12.
 */
public class SaveProductController implements Controller {
    private static final Log logger= LogFactory.getLog(InputProductController.class);

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        logger.info("SaveProductController called");
       /* httpServletRequest.setCharacterEncoding("utf-8");*/
        Product product=new Product();
        product.setName(httpServletRequest.getParameter("name"));
        product.setDescription(httpServletRequest.getParameter("description"));
        product.setPrice(httpServletRequest.getParameter("price"));
        System.out.println(product);
        ModelAndView modelAndView=new ModelAndView();
        /*modelAndView.setViewName("/WEB-INF/jsp/product/ProductDetails.jsp");*/
        modelAndView.setViewName("product/ProductDetails");
        modelAndView.addObject("product",product);


        return modelAndView;
    }
}
