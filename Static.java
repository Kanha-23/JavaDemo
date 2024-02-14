import java.util.*;
public class Static {
    static int age;
    static{
        age=18;
        System.out.println("static first"); 
    }

    static void show(){
        System.out.println("method");
    }
    public static void main(String[] args){
        System.out.println("exe after static");
        Static.show();
    }
    static{
        age=18;
        System.out.println("static first 2"); 
    }
   
}
