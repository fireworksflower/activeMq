package com.hh.controller;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 *
 * @author lijing
 * @date 2019/5/15 22:20
 **/
@Controller
@Aspect
public class LogAop {
    @Autowired
    private HttpServletRequest request;

    private Date startTime;//访问时间
    private Class executionCLass;//访问类
    private Method executionMethod;//访问方法


    //获取访问时间，访问类，访问方法
    @Before("execution(* com.hh.controller.*.*(..))")
    public void doBefore(JoinPoint joinPoint) throws NoSuchMethodException {
        startTime = new Date();//访问时间
        //获取访问的类
        executionCLass = joinPoint.getTarget().getClass();
        /**
         * 获取访问的方法
         */

        //获取访问方法的方法名称
        String methodName = joinPoint.getSignature().getName();

        //获取访问方法的方法参数
        Object[] args = joinPoint.getArgs();

        //无参数，只能获取无参数方法
        if(null==args ||args.length ==0 ){
            executionMethod = executionCLass.getMethod(methodName);
        }else{
            //有参数，就将args中所有元素遍历，获取对应的Class,装入到一个CLass[]
            Class[] classArgs = new Class[args.length];
            for (int i = 0; i <args.length ; i++) {
                classArgs[i] = args[i].getClass();
            }
            //获取有参数方法
            executionMethod = executionCLass.getMethod(methodName, classArgs);
        }

    }

    //获取日志中其他信息
    @After("execution(* com.hh.controller.*.*(..))")
    public void doAfter(JoinPoint joinPoint){

    }

}
