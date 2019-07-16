package f_annotation.web2.service;

import f_annotation.web2.repository.IAnnotationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AnnotationServiceImpl implements IAnnotationService {
//    @Resource()  若@Resource注解内不添加name属性,则按照类的默认名字来匹配--首字母小写annotationRepositoory
    @Resource(name = "annotationRepositoryImpl")
    private IAnnotationRepository annotationRepository;
    public void addUser() {
        System.out.println("serviceImpl:开始添加用户");
        annotationRepository.addUser();
    }
}
