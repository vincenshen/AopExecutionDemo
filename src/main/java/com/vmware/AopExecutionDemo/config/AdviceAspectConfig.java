package com.vmware.AopExecutionDemo.config;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class AdviceAspectConfig {

    /********PointCut********/

    @Pointcut("@annotation(com.vmware.AopExecutionDemo.annotation.AdminOnlyMethod)")
    public void matchAnnotation(){}

    @Pointcut("execution(* com.vmware.AopExecutionDemo.service.*.find*(int))")
    public void matchIntArgs(){}

    @Pointcut("execution(public * com.vmware.AopExecutionDemo.service..*.*(..) throws java.lang.IllegalAccessException)")
    public void matchExecption(){}

    @Pointcut("execution(int com.vmware.AopExecutionDemo.service.*.*(..))")
    public void matchReturn(){}


    /********Advice********/

    /**
     * 获取方法输入的参数
     * @param productId
     */
    @Before("matchIntArgs() && args(productId)")
    public void before(int productId){
        System.out.println("### before ### productId = [" + productId + "]");
    }

    /**
     *  获取方法返回参数
     * @param result
     */
    @AfterReturning(value = "matchReturn()", returning = "result")
    public void after(int result){
        System.out.println("### after ###:" + result);
    }


    /**
     * Before + After + AfterReturning
     * @param joinPoint
     * @return
     * @throws Throwable
     */
    @Around("matchReturn()")
    public Object after(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("### before ###");
        Object result;
        result = joinPoint.proceed(joinPoint.getArgs());
        System.out.println("### after ###" + result);
        return result;
    }


}
