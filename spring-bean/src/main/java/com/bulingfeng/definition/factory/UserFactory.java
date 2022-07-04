package com.bulingfeng.definition.factory;

import com.bulingfeng.domain.User;

public class UserFactory {
    public User createUser(){
        return new User(17L,"UserFactory");
    }
}
