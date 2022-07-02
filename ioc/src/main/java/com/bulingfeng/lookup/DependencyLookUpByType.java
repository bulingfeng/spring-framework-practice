package com.bulingfeng.lookup;

import com.bulingfeng.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * 按照类型进行查找
 * 1. 单个对象
 * 2. 多个对象
 */
public class DependencyLookUpByType {
    public static void main(String[] args) {
        BeanFactory beanFactory
                =new ClassPathXmlApplicationContext("MATA-INF/dependency-lookup.xml");
        // 单个对象
        lookUpByType(beanFactory);
        // 对象集合
        lookUpCollectionByType(beanFactory);
    }

    private static void lookUpCollectionByType(BeanFactory beanFactory) {
        if (beanFactory instanceof ListableBeanFactory){
            ListableBeanFactory listableBeanFactory
                    =(ListableBeanFactory) beanFactory;
            Map<String,User> map= listableBeanFactory.getBeansOfType(User.class);
            System.out.println("对象集合:"+map);
        }
    }

    /**
     * 单个对象的查找
     * @param beanFactory
     */
    private static void lookUpByType(BeanFactory beanFactory) {
        User bean = beanFactory.getBean(User.class);
        System.out.println("单个对象:"+bean);
    }
    /**
     * 集合类型的查找
     */

}
