package com.xys.controller;

import com.xys.model.Images;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/1/29.
 */
@Controller
public class SaveImage {
    @RequestMapping(value = "/saveImagess.do")
    public String saveImage(@ModelAttribute Images img, HttpServletRequest request, Model model){
        List<MultipartFile> files=img.getImages();
        List<String> fileNames= new ArrayList<String>();
        String rootPath=request.getServletContext().getRealPath("/image");
        File tempFile=new File(rootPath);
        if(!tempFile.exists()){
           tempFile.mkdir();
        }
        if(files!=null && files.size()>0){
            for(MultipartFile multipartFile:files){
                String fileName=multipartFile.getOriginalFilename();
                fileNames.add(fileName);
                File imageFile=new File(rootPath,fileName);
                try {
                    multipartFile.transferTo(imageFile);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        model.addAttribute("image",img);
        return "ImageDetail";
    }
    @RequestMapping("/testRequestHeader")
    public void  testRequestHeader(@RequestHeader String  referer){

    }
}
