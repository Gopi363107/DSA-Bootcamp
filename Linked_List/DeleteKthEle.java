class DeleteKthEle {
    public static void main(String[] args) {
        int[] arr ={1,23,12,56,14,26,37};
        int k = 2;
        Node head = convertDLL(arr);
        Node head1 = removeKthElement(head ,k);
        print(head1);
    }
    static Node delete(Node head){
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
    private static Node removeKthElement(Node head , int k){
        if(head == null){
            return null;
        }
        int cnt = 0;
        Node KNode = head;
        while(KNode != null){
            cnt++;
            if(cnt == k){
                KNode = KNode.next;
            }

            
        }
        Node prev = head.back;
        Node front = head.next;
        if(prev == null && front == null){
            return null;
        }

        if(prev == null){
            return delete(head);
        }

        if(front == null ){
            return delete(head);
        }

        prev.next = front;
        front.back = prev;

        KNode.next = null;
        KNode.back = null;

        return head;

    }
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
    static void print(Node head1){
        while(head1 != null){
            System.out.print(head1.data +" ");
            head1 = head1.next;
        }
        System.out.println();
    }
    
    
}
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

