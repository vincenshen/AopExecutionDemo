package com.vmware.AopExecutionDemo.config;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class ObjectAspectConfig {

    /**
     * this(com.vmware.AopExecutionDemo.log.Loggable  匹配所有实现了 Loggable 这个接口的类的所有方法
     */
//    @Pointcut("target(com.vmware.AopExecutionDemo.log.Loggable)")
//    public void matchCondition(){}
//
//    @Before("matchCondition()")
//    public void before(){
//        System.out.println("###this & before");
//    }
}
