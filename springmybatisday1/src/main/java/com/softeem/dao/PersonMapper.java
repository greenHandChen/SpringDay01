package com.softeem.dao;

import com.softeem.dto.Card;
import com.softeem.dto.Person;

public interface PersonMapper {

    public Card get(Integer id);

    public Person getPerson(Integer id);

}
