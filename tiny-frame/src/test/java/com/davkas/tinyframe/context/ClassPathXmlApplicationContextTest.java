package com.davkas.tinyframe.context;

import com.davkas.tinyframe.bean.HelloWorldService;
import org.junit.Test;

/**
 * Created by davkas on 16/8/1.
 */
public class ClassPathXmlApplicationContextTest {

    @Test
    public void test() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("tinyframe.xml");
        HelloWorldService helloWorldService = (HelloWorldService) applicationContext.getBean("helloWorldService");
        helloWorldService.helloWorld();
    }

}