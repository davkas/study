package com.davkas.tinyframe.aop;

import sun.jvm.hotspot.tools.jcore.ClassFilter;

/**
 * Created by davkas on 16/8/1.
 */
public interface Pointcut {

    ClassFilter getClassFilter();

    MethodMatcher getMethodMatcher();

}
