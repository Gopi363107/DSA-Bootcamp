class Node{
    int data;
    Node next;
    Node back;

    Node(int val,Node next1, Node back1){
        data = val ;
        next = next1;
        back = back1;

    }

    Node(int val){
        data = val;
        next = null;
        back = null;
    }
}
public class deleteDLLtail {
    private static Node convert(int [] arr){
        Node head = new Node(arr[0]);
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i] , null , prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    private static Node delete(Node head){
        if(head == null || head.next == null){
            return null;
        }
        Node tail = head;
        while(tail.next != null){
            tail = tail.next;
        }

        Node Tail = tail.back;
        Tail.next = null;
        tail.back = null;

        return head;
    }

    static void print(Node head1){
        while(head1 != null){
            System.out.print(head1.data+" ");
            head1 = head1.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {12,14,15,17,18};
        Node head = convert(arr);
        Node head1 = delete(head);
        print(head1);
    }
}