public class insert_at_start {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int d){
            data=d;
            next=null;
        }
    }

    public void insert_at_start(int d){
        Node newnode=new Node(d);
        
        newnode.next=head;
        head=newnode;
    }

    public void printnode(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
    }

    public static void main(String[] args) {
        insert_at_start l =new insert_at_start();
        l.insert_at_start(2);
        l.insert_at_start(50);
        l.insert_at_start(6);

        l.printnode();
    }
}
