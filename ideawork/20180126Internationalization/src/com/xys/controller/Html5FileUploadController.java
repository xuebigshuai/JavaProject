package com.xys.controller;

import com.xys.model.UploadFile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2018/2/1.
 */
@Controller
public class Html5FileUploadController {
    @RequestMapping(value = "/html5.do")
    public String inputProduct(@RequestHeader String  referer){
        System.out.println(referer);

        return "Html5";
    }

    @RequestMapping("/file_upload.do")
    public void  saveFile(HttpServletRequest request, @ModelAttribute UploadFile uploadFile,
                          Model model, BindingResult bindingResult)
    {
        MultipartFile multipartFile=uploadFile.getMultipartFile();
        String fileName=multipartFile.getOriginalFilename();
        String rootPath=request.getServletContext().getRealPath("/file");
        File fileTemp=new File(rootPath);
        if(!fileTemp.exists()){
            fileTemp.mkdir();
        }
        File file=new File(rootPath,fileName);
        try {
            multipartFile.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
