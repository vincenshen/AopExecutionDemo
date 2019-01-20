package com.vmware.AopExecutionDemo.config;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class ArgsAspectConfig {

    /**
     * args(int,..) 匹配 service 包下，所有带int参数的方法。
     */
    @Pointcut("args(int,..) && within(com.vmware.AopExecutionDemo.service.*)")
    public void matchArgs(){}

    @Before("matchArgs()")
    public void matchCondition(){
        System.out.println("###matchArgs && Before");
    }
}

