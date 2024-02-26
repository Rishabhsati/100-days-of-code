import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.insertLast(5);
        list.insertLast(6);
        list.insertLast(7);
        list.insert(99,3);
        list.display();
        System.out.println();
        System.out.println(list.getSize());
        list.delete(3);
        list.deleteFirst();
        list.deleteFirst();
        list.deleteFirst();
        list.display();
        System.out.println();
        System.out.println(list.getSize());
        list.deleteLast();
        list.display();
    }
}
