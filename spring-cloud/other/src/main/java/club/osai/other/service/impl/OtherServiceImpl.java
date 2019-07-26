package club.osai.other.service.impl;

import club.osai.other.dao.OtherDao;
import club.osai.other.po.Other;
import club.osai.other.service.OtherService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: OtherServiceImpl.java
 * @Version: 1.0
 * @Date: 2019/7/26
 * @Description:
 */
@Service
public class OtherServiceImpl implements OtherService {
    @Autowired
    private OtherDao otherDao;

    @Override
    public Other findByUserId(Long userId) {
        Optional<Other> byUserId = otherDao.findByUserId(userId);
        return byUserId.orElse(null);
    }

    @Override
    public Other findById(Long id) {
        Optional<Other> byId = otherDao.findById(id);

        return byId.orElse(null);
    }

    @Override
    public List<Other> findAll() {

        return otherDao.findAll();
    }

    @Override
    public void delete(Long id) {
        otherDao.deleteById(id);
    }

    @Override
    public void delete(Other other) {
        otherDao.delete(other);
    }


    @Override
    public Other add(Other other) {
        return otherDao.save(other);
    }

    @Override
    public Other update(Other other) {
        return otherDao.save(other);
    }
}

