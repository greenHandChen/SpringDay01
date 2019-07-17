package com.ljx.service.impl;

import com.ljx.dao.PersonDao;
import com.ljx.entry.Person;
import com.ljx.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("personServiceImpl")
public class PersonServiceImpl implements PersonService{
    @Autowired
    private Person person;
    @Autowired
    private PersonDao personDao;

    public PersonServiceImpl(){}
    public PersonServiceImpl(Person person,PersonDao personDao) {
        super();
        this.personDao = personDao;
        this.person = person;
    }

    @Override
    public void persist() {
        personDao.insert();
    }

    @Override
    public void printMsg() {
        System.out.println("姓名：" + person.getName() +"\n"+"年龄："+person.getAge() );
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }



}
