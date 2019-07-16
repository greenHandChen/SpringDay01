public class HelloSpring {
    private String info = "生命周期！";
   private DISpring diSpring;

   public  void initBean(){
       System.out.println("数据库连接配置完成！");
   }

   public void destoryBean(){
       System.out.println("当前数据库连接已成功被关闭");
   }
    public String getInfo() {
        return info;
    }
    public DISpring getDiSpring() {
        return diSpring;
    }

    public void setDiSpring(DISpring diSpring) {
        this.diSpring = diSpring;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    public String  helloDI(){
        return diSpring.getInfo1();
    }
}
