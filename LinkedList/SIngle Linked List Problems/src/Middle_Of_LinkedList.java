class Node{
    int data;
    Node next;
    Node(int data1,Node next1)
    {
         this.data = data1;
         this.next = next1;
    }
    Node(int data1)
    {
        this.data = data1;
        this.next = null;
    }
}
public class Middle_Of_LinkedList
{
    public static Node Middle_of_LinkedList(Node head)
    {
        Node slow = head;
        Node  fast = head;
        while(fast != null  && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    private static Node  ConvertArr2LL(int[] arr)
    {
        Node head = new Node(arr[0]);
        Node mover =  head;
        for(int i = 1;i < arr.length;i++)
        {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return  head;
    }
    private static void print (Node head)
    {
        while(head != null)
        {
            System.out.print(head.data +"->");
            head = head.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = ConvertArr2LL(arr);
        print(head);
        Node MiddleNode = Middle_of_LinkedList(head);
        System.out.println("Middle of Linked List :" + MiddleNode.data);
    }
}
