package com.hand;

public class HelloSpring2 {
    private String str="生命周期";

   public void initBean(){
       System.out.println("数据库连接完成");
   }
   public void destroyBean(){
       System.out.println("当前数据库连接已经关闭");
   }
}
