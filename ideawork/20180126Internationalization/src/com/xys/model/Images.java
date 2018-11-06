package com.xys.model;

import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2018/1/29.
 */
public class Images implements Serializable {
    private static final long serialVersionUID = 6573790484364221493L;
    private List<MultipartFile> images;

    public List<MultipartFile> getImages() {
        return images;
    }

    public void setImages(List<MultipartFile> images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "Images{" +
                "images=" + images +
                '}';
    }
}
