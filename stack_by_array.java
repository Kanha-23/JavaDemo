import java.util.*;
public class stack_by_array {
    
    public static class Stack{
        private int[] arr=new int[5];
        private int idx=0;

        void push(int x){
            arr[idx]=x;
            idx++;
        }
        int peek(){

            if(idx==0){
                System.out.println("Stack is empty!");
                return -1;
            } 

            return arr[idx-1];
        }
        int pop(){
            if(idx==0)
            {
                System.out.println("Stack is empty!");
                return -1;
            } 
            int top =arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }
        void display(){
            for(int i=0;i<=idx-1;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }
    }
    public static void main(String[] args) {
       Stack st= new Stack();
       st.push(5);
       st.push(7);
       st.push(9);
       st.push(4);
       st.push(2);
       st.display();
       int c=st.peek();
       System.out.println(c);
       int d=st.pop();
       System.out.println(d);
       st.display();
    }
}
