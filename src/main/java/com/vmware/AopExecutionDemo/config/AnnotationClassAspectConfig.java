package com.vmware.AopExecutionDemo.config;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AnnotationClassAspectConfig {

    /**
     * 匹配带有 AdminOnlyClass Annotation的类
     */
    @Pointcut("@within(com.vmware.AopExecutionDemo.annotation.AdminOnlyClass)")
    public void annotationClassCondition(){}


    @Before("annotationClassCondition()")
    public void before(){
        System.out.println("###annotationClass && before");
    }

}
