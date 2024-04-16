
package Queue;
import java.util.*;

public class start {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
       // or  Queue<Integer> q=new ArrayDeque<>();
        q.add(6);
        q.add(2);
        q.add(8);
        q.add(4);
        q.add(5);
        System.out.println(q);
        q.remove();
        System.out.println(q);
        q.poll();
        System.out.println(q);
        System.out.println(q.element());
        System.out.println(q.peek());
        System.out.println(q.size());
    }
}
