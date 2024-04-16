package Queue;

public class LL_imp {

    public static class Node{
        int val;
        Node next;

        Node(int val){
            this.val=val;
        }
    }
    public static class queueLL{
        Node head=null;
        Node tail=null;
        int size=0;
        public void add(int x){
            Node temp=new Node(x);
            if(size==0){
                head=tail=temp;

            }
            else {
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
        public int peek(){
            if(size==0){
                System.out.println("empty");
                return -1;
            }
            return head.val;
        }

        public int remove(){
            if(size==0){
                System.out.println("empty");
                return -1;
            }
            int x=head.val;
            head=head.next;
            size--;
            return x;
        }
        public void diaplay(){
            if(size==0){
                System.out.println("empty");
            }
                Node temp=head;
                while(temp!=null){
                    System.out.print(temp.val+" ");
                    temp=temp.next;
                }
                System.out.println();  
        }

    }
    public static void main(String[] args) {
        queueLL q=new queueLL();
        q.diaplay();
        q.add(3);
        q.add(4);
        q.add(7);
        q.add(1);
        q.diaplay();
        q.remove();
        q.diaplay();
    }
}
 