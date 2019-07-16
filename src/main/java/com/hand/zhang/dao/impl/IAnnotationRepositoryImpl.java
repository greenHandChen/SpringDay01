package com.hand.zhang.dao.impl;

import com.hand.zhang.dao.IAnnotationRepository;
import org.springframework.stereotype.Repository;

/**
 * ClassName:IAnnotationRepositoryImpl
 * Author:ZhangChunjia
 * Date:2019/7/16 19:04
 */
@Repository("annotationRepository")
public class IAnnotationRepositoryImpl implements IAnnotationRepository {

    @Override
    public void addPerson() {
        System.out.println("添加成功");
    }
}
