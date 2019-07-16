package com.ceh.spring.b_di;

import org.springframework.stereotype.Repository;

/**
 * Created by HuangHeng on 2019/7/16
 */
@Repository("annotationRepository")
public class AnnotationRepositionImpl implements IAnnotationRepository  {
    public void addUser() {
        System.out.println("添加用户成功");
    }
}
