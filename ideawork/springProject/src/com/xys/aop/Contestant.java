package com.xys.aop;

import com.xys.service.DeclaretParent;
import com.xys.service.imple.DeclareParentImpl;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/2/27.
 */
@Aspect
@Component
public class Contestant {
    @DeclareParents(
            value = "com.xys.service.AopTestService+",
            defaultImpl = DeclareParentImpl.class)
    public static DeclaretParent declaretParent;
}
