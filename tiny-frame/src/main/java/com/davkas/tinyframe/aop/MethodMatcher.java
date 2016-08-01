package com.davkas.tinyframe.aop;

import java.lang.reflect.Method;

/**
 * Created by davkas on 16/8/1.
 */
public interface MethodMatcher {

    boolean matches(Method method, Class targetClass);

}
