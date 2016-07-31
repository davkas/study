package com.davkas.tinyframe.facotry;

import com.davkas.tinyframe.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by davkas on 16/7/29.
 */
public abstract class AbstractBeanFacotry implements BeanFactory {

    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<String, BeanDefinition>();


    public Object getBean(String name) {
        return beanDefinitionMap.get(name);
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) throws Exception {
        Object bean = doCreateBean(beanDefinition);
        beanDefinition.setBean(bean);
        beanDefinitionMap.put(name,beanDefinition);
    }

    public abstract Object doCreateBean(BeanDefinition beanDefinition) throws Exception;

}