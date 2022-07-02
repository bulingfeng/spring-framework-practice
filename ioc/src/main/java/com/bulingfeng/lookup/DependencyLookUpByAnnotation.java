package com.bulingfeng.lookup;

import com.bulingfeng.annotation.Super;
import com.bulingfeng.domain.SuperUser;
import com.bulingfeng.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * 根据注解的方式来进行查找
 */
public class DependencyLookUpByAnnotation {
    public static void main(String[] args) {
        BeanFactory beanFactory
                =new ClassPathXmlApplicationContext("MATA-INF/dependency-lookup.xml");

        lookUpByAnnotation(beanFactory);
    }

    private static void lookUpByAnnotation(BeanFactory beanFactory) {
        if (beanFactory instanceof ListableBeanFactory){
            ListableBeanFactory listableBeanFactory
                    =(ListableBeanFactory) beanFactory;
            Map<String, User> beansWithAnnotation =
                    (Map) listableBeanFactory.getBeansWithAnnotation(Super.class);
            System.out.println("注解的方式获取到的beans:"+beansWithAnnotation);
        }
    }
}
