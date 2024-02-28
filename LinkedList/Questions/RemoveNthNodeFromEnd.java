package Questions;

public class RemoveNthNodeFromEnd {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.display();
        System.out.println();
        Node temp = RemoveNthNodeFromEndList(list.head,1);
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }
    public static Node RemoveNthNodeFromEndList(Node head,int n){
        if(n==0) return head;
        Node i = head;
        Node j = head;
        for(int k=0;k<n;k++){
            i=i.next;
        }
        Node prev = null;
        while(i!=null){
            prev = j;
            i=i.next;
            j=j.next;
        }
        if(prev==null) return head.next;
        prev.next = prev.next.next;
        return head;
    }
}
