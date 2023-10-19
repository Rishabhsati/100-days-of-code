package LinkedList;

class LL {
    Node head;
    Node tail;
    public void addFirst(int val){
        Node node = new Node(val);
        node.next=head;
        head=node;
        if(tail==null) tail = head;
    }
    public void addLast(int val){
        if(tail==null) addFirst(val);
        Node node = new Node(val);
        tail.next = node;
        tail=node;
    }
    public void insertBetween(int val , int index){
        if(index==0) addFirst(val);
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next=node;
    }
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head.next==null){
            tail=null;
        }
        return val;
    }
    public void deleteLast(){
        int sizeofll = size();
        if (sizeofll<=1)
            deleteFirst();
        Node temp = head;
        for (int i = 0; i < sizeofll-1; i++) {
            temp = temp.next;
        }
        tail=temp;
        tail.next=null;
    }
    public void insertRec(int index,int value){
        head = insertrec(index,value,head);
    }
    private Node insertrec(int index,int value, Node node){
        if(index==0){
            Node temp = new Node(value,node);
            return temp;
        }
        node.next = insertrec(index-=1,value,node.next);
        return node;
    }
    int size(){
        int count=0;
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
            count++;
        }
        return count;
    }
    public void printLL(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.print("END");
    }
}
class Node{
    int value;
    Node next;
    public Node(int value) {
        this.value = value;
    }
    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}
