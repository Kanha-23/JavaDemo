import java.util.LinkedList;

public class LL_insert_end {
    Node head;

    //node contain data and next pointer
     class Node{
        int data;
        Node next;

        //buit a constructor to set default value
        Node(int d){
            data=d;
            next=null;
        }
     }

    public void insertatend(int data){
        Node new_node = new Node(data);

        if(head==null){
            head = new Node(data);
            return;
        }

        new_node.next=null;
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new_node;
        return;
    }

    public void printnode(){
        int count=0;
        Node current=head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
            count++;
        }
        System.out.println();
        System.out.println("length of LL = "+count);
    }
    public static void main(String[] args) {
        LL_insert_end L = new LL_insert_end();

        L.insertatend(2);
        L.insertatend(6);
        L.insertatend(8);
        L.insertatend(1);
        L.insertatend(5);

        L.printnode();


    }
}
