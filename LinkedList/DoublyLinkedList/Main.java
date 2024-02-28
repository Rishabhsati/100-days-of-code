package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(3);
        list.insertFirst(9);
        list.insertLast(12);
        list.insertLast(15);
        list.insertLast(45);
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteFirst();
        list.display();
//        list.insert(5,77);
//        list.insert(9,87);
//        list.insert(6,97);
        list.deleteLast();
        list.display();
    }
}
