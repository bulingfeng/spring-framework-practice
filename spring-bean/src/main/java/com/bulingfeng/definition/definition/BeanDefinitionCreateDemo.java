package com.bulingfeng.definition.definition;

import com.bulingfeng.domain.User;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;

/**
 * BeanDefinition创建示例
 */
public class BeanDefinitionCreateDemo {
    public static void main(String[] args) {
        //1. 使用BeanDefinitionBuilder来创建BeanDefinition
        BeanDefinitionBuilder builder
                =BeanDefinitionBuilder.genericBeanDefinition(User.class);
        // 设置属性的值
        builder.addPropertyValue("name","bulingfeng");
        builder.addPropertyValue("age",18);
        // 得到BeanDefinition,BeanDefinition并不是bean的最终状态
        BeanDefinition beanDefinition= builder.getBeanDefinition();

        // 2.

    }
}
