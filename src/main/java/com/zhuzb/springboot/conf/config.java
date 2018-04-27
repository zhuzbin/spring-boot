package com.zhuzb.springboot.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/4/27
 * Time：16:45
 */
@Configuration
public class config {

    @Bean
    public static NoOpPasswordEncoder passwordEncoder(){
        return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
    }
}
