package com.suresh.controller;

import com.suresh.model.ProductForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.Locale;

/**
 * Created by Administrator on 2018/1/17.
 */
@Controller
public class Product {
    @RequestMapping(value = "/inputProduct.action")
    public String inputForm(){
        return "ProductForm";
    }
    @RequestMapping(value = "/product_save.action")
    public String saveProduct(@Valid @ModelAttribute("productForm") ProductForm productForm, Model model, Locale locale, BindingResult bindingResult){
        System.out.println(locale.getLanguage());
        System.out.println(locale.getDefault());
        Locale locale1=Locale.CHINESE;
        System.out.println(locale1);
        if(bindingResult.hasErrors()){
           // FieldError fieldError=bindingResult.getFieldError();
            return "ProductForm";
        }
        model.addAttribute("product",productForm);
        return  "ProductDetails";
    }
}
