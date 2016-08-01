package com.davkas.tinyframe.context;

import com.davkas.tinyframe.bean.BeanDefinition;
import com.davkas.tinyframe.bean.factory.AbstractBeanFactory;
import com.davkas.tinyframe.bean.factory.AutowireCapableBeanFactory;
import com.davkas.tinyframe.bean.io.ResourceLoader;
import com.davkas.tinyframe.bean.xml.XmlBeanDefinitionReader;

import java.util.Map;

/**
 * Created by davkas on 16/8/1.
 */
public class ClassPathXmlApplicationContext extends AbstractApplicationContext {

    private String configLocation;

    public ClassPathXmlApplicationContext(String configLocation, AbstractBeanFactory beanFacotry) throws Exception {
        super(beanFacotry);
        this.configLocation = configLocation;
        refresh();
    }

    public ClassPathXmlApplicationContext(String configLocation) throws Exception {
        this(configLocation,new AutowireCapableBeanFactory());
    }

    @Override
    public void refresh() throws Exception {
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions(configLocation);
        for (Map.Entry<String, BeanDefinition> beanDefinitionEntry : xmlBeanDefinitionReader.getRegistry().entrySet()) {
            beanFactory.registerBeanDefinition(beanDefinitionEntry.getKey(), beanDefinitionEntry.getValue());
        }
    }
}
