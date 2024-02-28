package DoublyLinkedList;

public class DoublyLL {
    Node head = null;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }
    public void insertLast(int val){
        Node node = new Node(val);
        node.next = null;
        if(head==null){
            node.prev = null;
            head = node;
            return;
        }
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }

    public void deleteFirst(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        if(head.next!=null){
            head = head.next;
            head.prev = null;
        }
        else{
            head = null;
        }
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node node = head;
        while(node.next!=null) {
            node = node.next;
        }
        node = node.prev;
        node.next = null;
    }

    public Node find(int val){
        Node node = head;
        while(node!=null){
            if(node.data==val){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public void insert(int after,int val){
       Node pre = find(after);
        if(pre==null) {
            System.out.println("node does not exist");
            return;
        }
        Node node = new Node(val);
        node.next = pre.next;
        node.prev = pre;
        pre.next = node;
        if(node.next != null){
            node.next.prev = node;
        }
    }

    public void display(){
        Node last = null;
        Node node = head;
        while(node!=null){
            System.out.print(node.data+" -> ");
            last = node;
            node = node.next;
        }
        System.out.print("END");
        System.out.println();
//        displayRev(last);
    }

    private void displayRev(Node tail) {
        System.out.println();
        while(tail!=null){
            System.out.print(tail.data+" -> ");
            tail = tail.prev;
        }
        System.out.print("START");
    }

    class Node{
        Node prev;
        Node next;
        int data;

        public Node (int val){
            this.data = val;
        }

        public Node(Node prev, Node next, int data) {
            this.prev = prev;
            this.next = next;
            this.data = data;
        }
    }

}
