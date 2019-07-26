package club.osai.other.service;

import club.osai.other.po.Other;

import java.util.List;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: OtherService.java
 * @Version: 1.0
 * @Date: 2019/7/26
 * @Description:
 */

public interface OtherService {
    Other findByUserId(Long userId);

    List<Other> findAll();

    Other findById(Long id);

    void delete(Long id);

    void delete(Other other);

    Other add(Other other);

    Other update(Other other);
}
