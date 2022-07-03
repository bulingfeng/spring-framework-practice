package com.bulingfeng.container;

import com.bulingfeng.domain.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * ICO容器的样例
 */
public class AnnotationIocContainer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext
                =new AnnotationConfigApplicationContext();
        applicationContext.register(AnnotationIocContainer.class);
        // 启动上下文(虽然方法名叫refresh)
        applicationContext.refresh();
        User user = applicationContext.getBean(User.class);
        System.out.println("user:"+user);
    }

    @Bean
    public User user(){
        User user=new User();
        user.setId(1L);
        user.setName("zhangsan");
        return user;
    }
}
