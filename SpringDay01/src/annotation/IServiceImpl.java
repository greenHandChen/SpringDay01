package annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//@Service("serviceImpl")
@Service
public class IServiceImpl implements IService{

    @Autowired
//    @Qualifier("repositoryImpl")
    private IRepository repository;

    @Override
    public void addUser() {
        System.out.println("开始添加用户。。。");
        repository.addUser();
    }
}
