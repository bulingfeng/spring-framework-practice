package com.bulingfeng.repository;

import com.bulingfeng.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ObjectFactory;

import java.util.Collection;

/**
 * 用户的仓库对象
 */
public class UserRepository {
    // 内奸的bean对象
    private Collection<User> collection;

    // 内建的非bean对象
    private BeanFactory beanFactory;

    private ObjectFactory<User> objectFactory;

    public Collection<User> getCollection() {
        return collection;
    }

    public void setCollection(Collection<User> collection) {
        this.collection = collection;
    }

    public BeanFactory getBeanFactory() {
        return beanFactory;
    }

    public void setBeanFactory(BeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    public ObjectFactory<User> getObjectFactory() {
        return objectFactory;
    }

    public void setObjectFactory(ObjectFactory<User> objectFactory) {
        this.objectFactory = objectFactory;
    }
}
