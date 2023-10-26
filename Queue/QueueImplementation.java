package Queue;
import java.util.*;
public class QueueImplementation {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(3);
        q.add(1);
        q.add(2);
        q.add(6);

        while(q.size()>0){
            System.out.println(q.remove());
        }
    }
}
