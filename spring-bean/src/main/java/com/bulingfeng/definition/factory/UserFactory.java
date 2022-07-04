package com.bulingfeng.definition.factory;

import com.bulingfeng.domain.User;

public interface UserFactory {
    default User createUser(){
        return new User(17L,"UserFactory");
    }
}
