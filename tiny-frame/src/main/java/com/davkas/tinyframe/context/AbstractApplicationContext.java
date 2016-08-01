package com.davkas.tinyframe.context;

import com.davkas.tinyframe.bean.factory.AbstractBeanFactory;

/**
 * Created by davkas on 16/8/1.
 */
public class AbstractApplicationContext implements ApplicationContext {

    protected AbstractBeanFactory beanFactory;

    public AbstractApplicationContext(AbstractBeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    public Object getBean(String name) {
        return beanFactory.getBean(name);
    }

    public void refresh() throws Exception {

    }



}
