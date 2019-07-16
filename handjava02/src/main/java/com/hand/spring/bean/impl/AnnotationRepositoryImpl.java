package com.hand.spring.bean.impl;

import com.hand.spring.bean.IAnnotationRepository;
import org.springframework.stereotype.Repository;

/**
 * @author lwy
 * @version V1.0
 * @program: SpringDay01
 * @Description: TODO
 * @date 2019/7/16 18:43
 */
@Repository("annotationRepositoryImpl")
public class AnnotationRepositoryImpl implements IAnnotationRepository {


    public void addUser() {
        System.out.println("添加用户成功!");
    }
}
