package com.xys.model.imple;

import com.xys.model.AnnotationModel;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/2/23.
 */
@Component("model3")
public class AnnotationModel3 implements AnnotationModel {
    @Override
    public void show() {
        System.out.println("Model3  通过自动检测定义Bean");
    }
}
