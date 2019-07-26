package com.hand.eureka.server.mapper;

import java.util.List;

public interface BaseMapper<E> {

    public List<E> getAllList();

    public E getById(Integer id);

    public int deleteById(Integer id);

    public int insert(E entity);

    public int update(E entity);

}
