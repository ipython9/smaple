package com.maple.smaple.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: hanyu
 * @Description:
 * @copyright @hanyu
 * @Date: Create in  2020/3/26 22:55
 */
@Component
@ConfigurationProperties(prefix = "note")
public class ThymeleafConfig {

    private String nice;

    public String getNice() {
        return nice;
    }

    public void setNice(String nice) {
        this.nice = nice;
    }
}
