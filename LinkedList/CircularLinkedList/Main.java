package CircularLinkedList;

public class Main {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.display();
        list.insert(5);
        list.insert(8);
        list.insert(3);
        list.insert(1);
        list.display();
        list.delete(5);
        list.display();
    }
}
