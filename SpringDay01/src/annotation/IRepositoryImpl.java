package annotation;

import org.springframework.stereotype.Repository;

//@Repository("repositoryImpl")
@Repository
public class IRepositoryImpl implements IRepository{
    @Override
    public void addUser() {
        System.out.println("增加用户成功！");
    }
}
