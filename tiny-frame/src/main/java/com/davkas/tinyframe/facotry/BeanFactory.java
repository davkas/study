package com.davkas.tinyframe.facotry;

import com.davkas.tinyframe.BeanDefinition;

/**
 * Created by davkas on 16/7/29.
 */
public interface BeanFactory {

    public Object getBean(String name);

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) throws Exception;

}
