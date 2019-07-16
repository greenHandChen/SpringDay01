package com.hand.po;

import org.springframework.stereotype.Repository;

@Repository
public class AnnotationResponstory implements IAnnotationResponstory {
    @Override
    public void add() {
        System.out.println("添加成功");
    }
}
