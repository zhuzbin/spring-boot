package com.zhuzb.springboot.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/4/13
 * Time：16:28
 */
@Configuration
@ConfigurationProperties(prefix = "book")
public class Book {

    private String name;

    private String author;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
