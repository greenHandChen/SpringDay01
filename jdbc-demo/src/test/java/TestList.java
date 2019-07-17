import java.util.LinkedList;
import java.util.List;

public class TestList {

   public static void main(String[] args){
       List list=new LinkedList();
       list.add(123);
       System.out.println(list.size());
       System.out.println(list.get(0));
       list.add(222);
       list.add(123);
       System.out.println(list.size());

   }
}
