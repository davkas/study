package com.davkas.tinyframe.aop;

import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/**
 * Created by davkas on 16/8/1.
 */
public class ReflectiveMethodInvocation implements MethodInvocation{


    private Object target;

    private Method method;

    private Object[] args;

    public ReflectiveMethodInvocation(Object target, Method method, Object[] args) {
        this.target = target;
        this.method = method;
        this.args = args;
    }

    public Method getMethod() {
        return this.method;
    }


    public Object[] getArguments() {
        return args;
    }


    public Object proceed() throws Throwable {
        return method.invoke(target,args);
    }


    public Object getThis() {
        return this.target;
    }

    public AccessibleObject getStaticPart() {
        return this.method;
    }
}
