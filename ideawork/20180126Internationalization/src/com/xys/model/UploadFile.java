package com.xys.model;

import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/2/1.
 */
public class UploadFile implements Serializable {
    private static final long serialVersionUID = -8655976758685864374L;
    private MultipartFile multipartFile;

    public MultipartFile getMultipartFile() {
        return multipartFile;
    }

    public void setMultipartFile(MultipartFile multipartFile) {
        this.multipartFile = multipartFile;
    }

    @Override
    public String toString() {
        return "UploadFile{" +
                "multipartFile=" + multipartFile +
                '}';
    }
}
