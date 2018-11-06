package com.xys.service.imple;

import com.xys.model.AnnotationModel;
import com.xys.model.Model1;
import com.xys.model.Model2;
import com.xys.service.TestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by Administrator on 2018/2/13.
 */
public class TesModelImple implements TestModel {

    @Autowired
    private Model1 model1;

    @Autowired
    private Model2 model2;

    @Autowired
    @Qualifier("annotationModel1")
    private AnnotationModel annotationModel;

    public void setModel1(Model1 model1) {
        this.model1 = model1;
    }



    @Override
    public void show() {
       model1.show();
       model2.show();
       annotationModel.show();
    }
}
