package com.vmware.AopExecutionDemo.config;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class AnnotationAspectConfig {

    /**
     * 匹配带有 AdminOnlyMethod Annotation的方法
     */
    @Pointcut("@annotation(com.vmware.AopExecutionDemo.annotation.AdminOnlyMethod)")
    public void matchAnnotation(){}

    @Before("matchAnnotation()")
    public void before(){
        System.out.println("###matchAnnotation && Before");
    }
}
