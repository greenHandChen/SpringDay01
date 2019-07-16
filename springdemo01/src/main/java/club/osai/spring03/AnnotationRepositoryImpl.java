package club.osai.spring03;

import org.springframework.stereotype.Repository;

/**
 * Author: Chen Quan
 * GitHub: https://github.com/chenquan
 * Email: chenquan@osai.club
 * Class: AnnotationRepositoryImpl.java
 * Version: 1.0
 * Date: 2019/7/16
 * Description:
 */
@Repository("annotationRepository")
public class AnnotationRepositoryImpl implements AnnotationRepository {
    @Override
    public void addUser() {
        System.out.println("add user!");

    }
}
