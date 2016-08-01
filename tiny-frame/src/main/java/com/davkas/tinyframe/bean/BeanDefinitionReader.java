package com.davkas.tinyframe.bean;

/**
 * Created by davkas on 16/7/29.
 */
public interface BeanDefinitionReader {

    void loadBeanDefinitions(String location) throws Exception;

}
