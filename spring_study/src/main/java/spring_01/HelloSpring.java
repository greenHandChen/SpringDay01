package spring_01;

import spring_01.DISpring;

public class HelloSpring {
//   private  String info;
//
//    public String getInfo() {
//        return info;
//    }
//
//    public void setInfo(String info) {
//        this.info = info;
//    }

    private DISpring diSpring;


    public DISpring getDiSpring() {
        return diSpring;
    }

    public void setDiSpring(DISpring diSpring) {
        this.diSpring = diSpring;
    }

    public  String helloDI(){
        return  diSpring.getInfo();
    }
}
