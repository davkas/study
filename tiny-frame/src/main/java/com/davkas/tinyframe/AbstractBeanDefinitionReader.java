package com.davkas.tinyframe;

import com.davkas.tinyframe.io.ResourceLoader;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by davkas on 16/7/29.
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {

    private Map<String,BeanDefinition> registry;

    private ResourceLoader resourceLoader;

    public AbstractBeanDefinitionReader(ResourceLoader resourceLoader) {
        this.registry = new HashMap<String, BeanDefinition>();
        this.resourceLoader = resourceLoader;
    }

    public abstract void loadBeanDefinitions(String location) throws Exception ;

    public Map<String, BeanDefinition> getRegistry() {
        return registry;
    }

    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }

}
