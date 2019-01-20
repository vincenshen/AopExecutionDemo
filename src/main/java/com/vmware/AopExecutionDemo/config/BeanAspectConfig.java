package com.vmware.AopExecutionDemo.config;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BeanAspectConfig {

    /**
     * 匹配指定的Bean对象
     */
//    @Pointcut("bean(productService)")
//    public void matchBean(){
//
//    }
//
//    @Before("matchBean()")
//    public void before(){
//        System.out.println("#### matchBean");
//    }
}
