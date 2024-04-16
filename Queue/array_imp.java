package Queue;
import java.util.*;
public class array_imp {

    public static class queueA{
        int f=-1;
        int r=-1;
        int size=0;
        int[] arr=new int[100];

        public void add(int val){
            if(r==arr.length-1){
                System.out.println("queue is full");
                return;
            }
            if(f==-1){
                f=r=0;
                arr[0]=val;
            }
            else{
                arr[++r]=val;
            }
            size++;
        }

        public int remove(){

            if(size==0){
                System.out.println("queue is empty");
                return -1;
            }

            f++;
            size--;
            return arr[f-1];
        }

        
        public int peek(){
            if(size==0){
                System.out.println("queue is empty");
                return -1;
            }
    
            return arr[f];
        }

        public void diaplay(){
            if(size==0){
                System.out.println("empty");
            }
            else{
                for(int i=f;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }

    }
    public static void main(String[] args) {
        queueA q=new queueA();
        q.diaplay();
        q.add(5);
        q.add(4);
        q.add(6);
        q.diaplay();
        q.remove();
        q.diaplay();
        System.out.println(q.peek());
    }
}