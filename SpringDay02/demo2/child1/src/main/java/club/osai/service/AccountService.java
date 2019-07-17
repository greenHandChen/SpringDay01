package club.osai.service;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: AccountService.java
 * @Version: 1.0
 * @Date: 2019/7/17
 * @Description:
 */

public interface AccountService {

    void transfer(String outer, String inner, Double money);
}
