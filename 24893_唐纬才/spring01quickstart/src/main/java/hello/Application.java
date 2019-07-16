package hello;

import java.sql.SQLOutput;

public class Application {
    public  static  void main(String[] orgs){
        //创建打印机对象
        System.out.println("Application!");
        MessagePrinter messagePrinter=new MessagePrinter();
        //创建消息服务对象
        MessagService service=new MessagService();
        //设置打印机对象的消息熟属性
        messagePrinter.setMessagService(service);
        //打印消息
        messagePrinter.printMessage();
    }
}