package com.davkas.tinyframe;

import com.davkas.tinyframe.facotry.AutowireCapableBeanFactory;
import com.davkas.tinyframe.facotry.BeanFactory;
import com.davkas.tinyframe.io.ResourceLoader;
import com.davkas.tinyframe.xml.XmlBeanDefinitionReader;
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
        BeanFactory beanFacotry = new AutowireCapableBeanFactory();
        for(Map.Entry<String,BeanDefinition> beanDefinitionEntry : reader.getRegistry().entrySet()){
            beanFacotry.registerBeanDefinition(beanDefinitionEntry.getKey(), beanDefinitionEntry.getValue());
        }
        HelloWorldService helloWorldService = (HelloWorldService) beanFacotry.getBean("helloWorldService");
        helloWorldService.helloWorld();
    }

}
