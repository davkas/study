package com.davkas.tinyframe;

import com.davkas.tinyframe.bean.BeanDefinition;
import com.davkas.tinyframe.bean.HelloWorldService;
import com.davkas.tinyframe.bean.factory.AbstractBeanFactory;
import com.davkas.tinyframe.bean.factory.AutowireCapableBeanFactory;
import com.davkas.tinyframe.bean.io.ResourceLoader;
import com.davkas.tinyframe.bean.xml.XmlBeanDefinitionReader;
import org.junit.Test;

import java.util.Map;

/**
 * Created by davkas on 16/7/29.
 */
public class BeanFactoryTest {

    @Test
    public void test() throws Exception{
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(new ResourceLoader());
        reader.loadBeanDefinitions("tinyframe.xml");
        AbstractBeanFactory beanFacotry = new AutowireCapableBeanFactory();
        for(Map.Entry<String,BeanDefinition> beanDefinitionEntry : reader.getRegistry().entrySet()){
            beanFacotry.registerBeanDefinition(beanDefinitionEntry.getKey(), beanDefinitionEntry.getValue());
        }
        HelloWorldService helloWorldService = (HelloWorldService) beanFacotry.getBean("helloWorldService");
        helloWorldService.helloWorld();
    }

}
