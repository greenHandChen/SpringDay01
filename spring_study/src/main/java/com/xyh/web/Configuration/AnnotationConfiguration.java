package com.xyh.web.Configuration;

import com.xyh.web.Service.AnnotationService;
import com.xyh.web.ServiceImpl.AnnotationServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.xml.ws.Service;

@Configuration
public class AnnotationConfiguration {

    @Bean
    @Scope("singleton")
    public AnnotationService annotationService1() {
        return new AnnotationServiceImpl();
    }

    @Bean
    @Scope("prototype")
    public AnnotationService annotationService2() {
        return new AnnotationServiceImpl();
    }
}
