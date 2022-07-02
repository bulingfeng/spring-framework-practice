package com.bulingfeng.injection;

import com.bulingfeng.domain.User;
import com.bulingfeng.repository.UserRepository;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

import java.util.Collection;

/**
 * 依赖注入
 */
public class DependencyInjection {
    public static void main(String[] args) {
        BeanFactory beanFactory
                =new ClassPathXmlApplicationContext("MATA-INF/dependency-injection.xml");
        UserRepository userRepository = beanFactory.getBean("userRepository", UserRepository.class);
        System.out.println("user的集合为:"+userRepository.getCollection());
        ObjectFactory<User> objectFactory=userRepository.getObjectFactory();
        System.out.println("objectFactory中获取到的对象为:"+objectFactory.getObject());

        /**
         * bean大致能够分为两种,内置的bean和容器内置的bean
         */
        // 容器中内置的bean
        Environment environment=beanFactory.getBean(Environment.class);
        System.out.println(" 内建 environment 对象 "+environment);
    }
}
