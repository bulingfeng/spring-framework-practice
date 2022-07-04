package com.bulingfeng.definition.instantiation;

import com.bulingfeng.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * 实例化bean
 */
public class BeanInstantiationDemo {
    public static void main(String[] args) {
        ApplicationContext beanFactory=
                new ClassPathXmlApplicationContext("META-INF/bean-instantiation.xml");
        Map<String, User> beansOfType = beanFactory.getBeansOfType(User.class);
        System.out.println(beansOfType);
    }
}
