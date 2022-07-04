package com.bulingfeng.definition.instantiation;

import com.bulingfeng.definition.factory.UserFactory;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * 特殊方式进行bean的实例化
 */
public class SpecialBeanInstantiationDemo {
    public static void main(String[] args) {
        demoServiceLoader();
    }


    public static void demoServiceLoader(){
        ServiceLoader<UserFactory> load
                = ServiceLoader.load(UserFactory.class, Thread.currentThread().getContextClassLoader());
        Iterator<UserFactory> iterator=load.iterator();
        while (iterator.hasNext()){
            UserFactory userFactory=iterator.next();
            System.out.println(userFactory.createUser());
        }
    }
}
