class Node{
    int data;
    Node next;
    Node back;

     public Node(int val , Node next1 , Node back1){
        this.data = val;
        this.next = next1;
        this.back = back1;
    }

    public Node(int val){
        this.data = val;
        this.next = null;
        this.back = null; 
    }
}
public class Arr2DLL {
    public static Node convertDLL(int[] arr){
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i] , null , prev);
            prev.next = temp;
            prev = temp; 
        }
        return head;
    }

    static void print(Node head){
        while(head != null){
            System.out.print(head.data +" ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String args[]){
        int [] arr = {1,3,5,6,8};
        Node head = convertDLL(arr);
        print(head);
    }
}
