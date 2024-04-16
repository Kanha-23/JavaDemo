import java.util.*;

public class LL_array {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static class LLStack{
        Node head=null;
        int size=0;
        void push(int x){
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }
        int peek(){
            if(head==null){
                System.out.println("Stack is empty");
                return -1;
            }
            return head.val;
        }
        int pop(){
            if(head==null){
                System.out.println("Stack is empty");
                return -1;
            }
            int x=head.val;
            head = head.next;
            return x;
            
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        LLStack st = new LLStack();
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
