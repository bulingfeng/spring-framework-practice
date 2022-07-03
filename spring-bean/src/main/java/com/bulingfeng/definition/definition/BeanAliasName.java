package com.bulingfeng.definition.definition;

import com.bulingfeng.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * bean的别名
 */
public class BeanAliasName {
    public static void main(String[] args) {
        BeanFactory beanFactory
                = new ClassPathXmlApplicationContext("META-INF/bean-definition.xml");
        User user = beanFactory.getBean("user", User.class);
        User aliasUser = beanFactory.getBean("spring-bean-user", User.class);
        System.out.println("别名和非别名获取到对象是否一样:"+(user==aliasUser));

    }
}
