package com.bulingfeng.definition.definition;

import com.bulingfeng.domain.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

import java.util.Arrays;

/**
 * 使用注解来进行bean的注册
 * @Import和@Bean都可以创建对应的bean
 */
@Import(value = {User.class})
public class BeanAnnotationCreateDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext=
                new AnnotationConfigApplicationContext();
        // 把对应类注册到容器当中
        applicationContext.register(BeanAnnotationCreateDemo.class);
        // 启动容器
        applicationContext.refresh();
        // 获取到bean
        String[] beanNamesForType = applicationContext.getBeanNamesForType(User.class);
        System.out.println(Arrays.asList(beanNamesForType));
        // 关闭容器
        applicationContext.close();
    }

    @Bean
    public User user(){
        return new User(18L,"bulingfeng");
    }
}
