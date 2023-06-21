package com.paul.web;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * this will replace my dispatcher servlet config xml file
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.paul")
public class MvcConfig extends WebMvcConfigurationSupport {

}
