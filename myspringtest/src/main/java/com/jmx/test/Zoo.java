package com.jmx.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Zoo {
     @Autowired
     private Monkey monkey;
     @Autowired
     private Trigger trigger;


    @java.lang.Override
    public java.lang.String toString() {
        return "Zoo{" +
                "monkey=" + monkey +
                ", trigger=" + trigger +
                '}';
    }
}
