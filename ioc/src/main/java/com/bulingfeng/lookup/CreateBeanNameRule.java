package com.bulingfeng.lookup;

import com.bulingfeng.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 探索bean生产名字的规则
 */
public class CreateBeanNameRule {
    public static void main(String[] args) {
        ApplicationContext beanFactory
                =new ClassPathXmlApplicationContext("MATA-INF/beans-name.xml");

        User user = beanFactory.getBean(User.class);
        // 如果不指定 名称就是按照类型"com.bulingfeng.domain.User#0"的方式来指定
        String[] beanNamesForType = beanFactory.getBeanNamesForType(User.class);
        System.out.println("bean name:"+beanNamesForType);
    }
}
