class Reverse_LL_iterate {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }


    // implementation of insertion of a node at the end
    public void insertAtEnd(int newData){
        Node newNode = new Node(newData);

        // linkedlist is empty
        if(head == null){
            head = new Node(newData);
            return;
        }

        // linkedlist is not empty
        newNode.next = null;
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
        return;
    }




    // implementation of reversal of a linkedlist using an iterative approach
    public void reverseLL(){
        Node curr = head;
        Node prev = null;
        Node nextPtr = null;

        while(curr != null){
            nextPtr = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextPtr;
        }

        head = prev;
        return;
    }


    // implementation of displaying the linkedlist
    public void displayLL(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    public static void main(String[] args) {
        Reverse_LL_iterate llist = new Reverse_LL_iterate();
        llist.insertAtEnd(2);
        llist.insertAtEnd(4);
        llist.insertAtEnd(8);
        llist.insertAtEnd(5);
        llist.insertAtEnd(0);
        
        llist.displayLL();
        System.out.println();


        llist.reverseLL();
        System.out.println("Reversal of a Linked List is");
        llist.displayLL();
        System.out.println();
    }
}
