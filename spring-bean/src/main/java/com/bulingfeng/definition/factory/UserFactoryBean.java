package com.bulingfeng.definition.factory;

import com.bulingfeng.domain.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * 使用beanFactory可以进行实例化
 */
public class UserFactoryBean implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        return new User(16L,"UserFactoryBean");
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
