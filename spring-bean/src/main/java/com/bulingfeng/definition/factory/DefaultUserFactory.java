package com.bulingfeng.definition.factory;

import javax.annotation.PostConstruct;

public class DefaultUserFactory implements UserFactory{

    @PostConstruct
    public void init(){
        System.out.println("DefaultUserFactory中 @PostConstruct" +
                "init 正在初始化");
    }

    public void initDefaultUserFactory(){
        System.out.println("DefaultUserFactory中 initDefaultUserFactory" +
                "init 正在初始化");
    }
}
