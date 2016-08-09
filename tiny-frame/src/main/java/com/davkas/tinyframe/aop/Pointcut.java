package com.davkas.tinyframe.aop;


/**
 * Created by davkas on 16/8/1.
 */
public interface Pointcut {

    ClassFilter getClassFilter();

    MethodMatcher getMethodMatcher();

}
