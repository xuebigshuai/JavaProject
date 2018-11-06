package com.xys.service.imple;

import com.xys.model.AnnotationModel;
import com.xys.service.TestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/2/23.
 */
@Service("test2")
public class Test2 implements TestModel {
    @Autowired
    @Qualifier("model3")
    private AnnotationModel annotationModel;
    @Override
    public void show() {
        annotationModel.show();
    }
}
