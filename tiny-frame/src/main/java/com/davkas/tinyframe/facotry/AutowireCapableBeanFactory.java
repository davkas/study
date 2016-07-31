package com.davkas.tinyframe.facotry;

import com.davkas.tinyframe.BeanDefinition;
import com.davkas.tinyframe.PropertyValue;

import java.lang.reflect.Field;

/**
 * Created by davkas on 16/7/29.
 */
public class AutowireCapableBeanFactory extends AbstractBeanFacotry {

    @Override
    public Object doCreateBean(BeanDefinition beanDefinition) throws Exception {
        Object bean = createBeanInstance(beanDefinition);
        applyPropertyValues(bean, beanDefinition);
        return bean;
    }

    public Object createBeanInstance(BeanDefinition beanDefinition) throws Exception {
        return beanDefinition.getBeanClass().newInstance();
    }

    protected void applyPropertyValues(Object bean, BeanDefinition mbd) throws Exception {
        for(PropertyValue propertyValue : mbd.getPropertyValues().getPropertyValueList()){
            Field declaredField = bean.getClass().getDeclaredField(propertyValue.getName());
            declaredField.setAccessible(true);
            declaredField.set(bean, propertyValue.getValue());
        }
    }
}
