package com.bulingfeng.lookup;

import com.bulingfeng.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  spring中分为 实时查找和延迟查找
 *
 */
public class DependencyLookUpByName {
    public static void main(String[] args) {

        BeanFactory beanFactory
                =new ClassPathXmlApplicationContext("MATA-INF/dependency-lookup.xml");
//        realTimeLookUp(beanFactory);
        lazyLookUp(beanFactory);

    }
    /**
     * 实时查找
     */
    public static void realTimeLookUp(BeanFactory beanFactory){
        // xml配置文件中，如果只写了id而没有写name，那么这个bean的name就是id
        User user = beanFactory.getBean("user", User.class);
        System.out.println(user);
    }
    /**
     * 延迟查找
     * 延迟查找和懒加载没有半毛钱关系,准备去的来说此时的延迟查找=间接查找
     */
    public static void lazyLookUp(BeanFactory beanFactory){
        ObjectFactory<User> userObjectFactory=
                (ObjectFactory<User>)beanFactory.getBean("objectFactory");
        User user = userObjectFactory.getObject();
        System.out.println("延迟查找的结果为:"+user);
    }
}
