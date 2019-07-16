package spring_06;

import org.springframework.stereotype.Repository;

@Repository("aunotationRepository")
public class AunotationRepositoryImpl implements AunotationRepository {
    public void addUser() {
        System.out.println("添加用户成功");
    }
}
