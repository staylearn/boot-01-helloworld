package com.guigu.boot.config;

import ch.qos.logback.core.db.DBHelper;
import com.guigu.boot.bean.Pet;
import com.guigu.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({User.class, DBHelper.class})
@Configuration
public class MyConfig {

    @Bean
    public User user01() {
        return new User("zhangsan", 18);
    }

    @Bean
    public Pet cat() {
        return new Pet("cat");
    }

}
