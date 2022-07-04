package com.bulingfeng.definition.instantiation;

import com.bulingfeng.definition.factory.DefaultUserFactory;
import com.bulingfeng.definition.factory.UserFactory;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 初始化bean
 */
public class InitializationBeanDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext=
                new AnnotationConfigApplicationContext();
        // 先进行注册然后再启动applicationContext
        applicationContext.register(InitializationBeanDemo.class);
        applicationContext.refresh();
        // 根据类型来获取bean
        UserFactory bean = (UserFactory)applicationContext.getBean(DefaultUserFactory.class);
        System.out.println(bean);
        applicationContext.close();
    }

    @Bean(initMethod = "initDefaultUserFactory")
    public UserFactory userFactory(){
        return new DefaultUserFactory();
    }
}
