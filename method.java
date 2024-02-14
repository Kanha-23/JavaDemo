//Method overloadingg


// import java.util.*;

 class Calc{
    public int add(int a,int b){
        int result=a+b;
        return result;
    }
    public int add(int a,int b,int c){
        int result=a+b+c;
        return result;

    }
     public double add(double a,double b){
        double result=a+b;
        return result;
    }
}
public class method {
    public static void main(String[] args){
        Calc obj=new Calc();

        int ans=obj.add(2,3);
        double ans1=obj.add(2.8,3.2);
        int ans2=obj.add(1,2,4);
        System.out.println(ans);
        System.out.println(ans1);
        System.out.println(ans2);
        
    }
}
