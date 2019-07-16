package com.jmx.test;

import javax.annotation.Resource;

public class CarFactory{
     @Resource(name="benz")
     private ICar car;
      public String toString(){
         return car.getCarName();

     }
}
