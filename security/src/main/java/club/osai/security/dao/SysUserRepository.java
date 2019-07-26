package club.osai.security.dao;

        import club.osai.security.po.SysUser;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.stereotype.Repository;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: SysUserRepository.java
 * @Version: 1.0
 * @Date: 2019/7/24
 * @Description:
 */
//@Repository
public interface SysUserRepository extends JpaRepository<SysUser, Long> {
    SysUser findByUsername(String username);
}
