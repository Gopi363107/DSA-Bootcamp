class Node{
    int data;
    Node next;
    Node back;

    Node(int val , Node next1 , Node back1){
        this.data = val ;
        this.next = next1;
        this.back = back1;
    }

    Node(int val){
        this.data = val ;
        this.next = null;
        this.back = null;
    }
}
public class deleteEleDLL {
    public static Node delete(Node head1){
        if(head1 == null || head1.next == null) return null;

        Node prev  = head1;
        head1 = head1.next;

        head1.back = null;
        prev.next = null;

        delete(prev);
        return head1;
    }
    static void print(Node head){
        while(head != null){
            System.out.print(head.data +" ");
            head = head.next;
        }
        System.out.println();
    }
    private static Node convert2DLL(int[] arr){
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null , prev);
            prev.next = temp;;
            prev =temp;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {3,5,2,6,8,9};
        Node head = convert2DLL(arr);
        Node head1 = delete(head);
        print(head1);
    }
}
