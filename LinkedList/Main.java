package LinkedList;

public class Main {
    public static void main(String[] args) {
        LL node = new LL();
        node.addFirst(5);
        node.addLast(2);
        node.addLast(4);
        node.addLast(18);
        node.addLast(7);
        node.insertRec(2,55);
        node.printLL();
//        System.out.println();
//        node.insertBetween(100,3);
//        node.insertBetween(99,0);
//        System.out.println(node.deleteFirst());
//        node.printLL();
//        node.deleteLast();
//        node.deleteFirst();
//        System.out.println();
//        node.printLL();
//        node.deleteLast();
//        System.out.println();
//        node.printLL();
    }
}
