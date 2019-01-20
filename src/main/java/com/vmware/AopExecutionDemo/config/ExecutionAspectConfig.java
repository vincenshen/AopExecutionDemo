package com.vmware.AopExecutionDemo.config;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExecutionAspectConfig {

    /**
     *  public * com.vmware.AopExecutionDemo.service.*Service.*(..)
     *  第一个 * 表示拦截所有返回值, 也可以是 void , String, int等类型，表示只拦截返回具体类型的方法
     *  第二个 * 表示匹配service包下以Service结尾的类
     *  第三个 * 表示匹配类中的所有方法, 也可以是具体的方法
     *  .. service后面如果是两个点，表示匹配service包和子包中的类
     *  .. 结尾的两个点，表示接收方法中的任意参数，为空表示匹配无参的方法，也可以是String, int等类型，表示只拦截有具体参数的方法
     *  最后面还可以跟 throws + 异常类，表示只拦截有异常的方法
     */
//    @Pointcut("execution(* com.vmware.AopExecutionDemo.service..*Service.*(..))")
//    public void matchCondition(){
//
//    }
//
//    @Before("matchCondition()")
//    public void before(){
//        System.out.println("###excution express...before");
//    }
}
