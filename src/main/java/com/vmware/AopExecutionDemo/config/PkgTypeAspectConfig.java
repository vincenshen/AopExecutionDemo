package com.vmware.AopExecutionDemo.config;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PkgTypeAspectConfig {

    /**
     * within(com.vmware.AopExecutionDemo.service..*)  匹配service包及子包下的所有类的所有方法
     * within(com.vmware.AopExecutionDemo.service.ProductService) 匹配ProductService这个类的所有方法
     */
//    @Pointcut("within(com.vmware.AopExecutionDemo.service..*)")
//    public void matchType(){}
//
//    @Before("matchType()")
//    public void before(){
//        System.out.println(" ");
//        System.out.println("###before");
//    }
}
