package spring_06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("annotationServiceImpl")
public class AunotationServiceImpl implements AunotationService {

    @Autowired
    @Qualifier("aunotationRepository")
    private AunotationRepository aunotationRepository;

    public void addUser() {
        System.out.println("开始添加用户。。。");
        aunotationRepository.addUser();

    }
}
