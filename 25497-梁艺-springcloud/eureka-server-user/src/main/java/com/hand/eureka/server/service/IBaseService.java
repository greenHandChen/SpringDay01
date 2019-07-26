package com.hand.eureka.server.service;

import java.util.List;

public interface IBaseService<E> {

    public List<E> getAllList();

    public E getById(Integer id);

    public int deleteById(Integer id);

    public int insert(E entity);

    public int update(E entity);
}
