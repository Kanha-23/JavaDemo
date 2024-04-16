import java.util.*;
public class stack1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        System.out.println("Enter size of stack:");
        int n;
        n=sc.nextInt();
        System.out.println("fill element in stack:");
        for(int i=1;i<=n;i++){
            int x=sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
//coping a stack...
        //1.reverse
        Stack<Integer> rt=new Stack<>();

        for(int i=1;i<=n;i++){
           
            rt.push(st.pop());
        }
        System.out.println("reversed:" + rt);
        //2.again form another stack reverse
         //1.reverse
         Stack<Integer> ft=new Stack<>();

         for(int i=1;i<=n;i++){
            
             ft.push(rt.pop());
         }
         System.out.println("Final copied stack:" + ft);
    }
}
