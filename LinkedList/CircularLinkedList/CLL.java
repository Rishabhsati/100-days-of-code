package CircularLinkedList;

public class CLL {

    Node head;
    Node tail;

    public void insert(int val){
        Node node = new Node(val);
        if(head==null){
            head = node;
            tail = node;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void delete(int val){
        Node node = head;
        if(node==null){
            System.out.println("empty hu bro");
            return;
        }
        if(node.val==val){
            head=head.next;
            tail.next=head;
            return;
        }
        do{
            Node n = node.next;
            if(n.val==val){
                node.next = n.next;
                break;
            }
            node=node.next;
        }while(node!=head);
    }
    public void display(){
        Node curr = head;
        if(curr==null){
            System.out.println("empty huu bro ");
            return;
        }
        do{
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }while(curr!=head);
        System.out.println("HEAD");
        System.out.println();
    }

    class Node{
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
        }
    }
}
