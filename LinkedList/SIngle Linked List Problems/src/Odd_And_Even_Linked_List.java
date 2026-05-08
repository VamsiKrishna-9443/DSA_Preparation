class  Node8
{
    int data;
    Node8 next;
    Node8(int data1,Node8 next1)
    {
        this.data = data1;
        this.next = next1;
    }
    Node8(int data1)
    {
        this.data = data1;
        this.next = null;
    }
}
public class Odd_And_Even_Linked_List
{
    public static Node8 odd_evenList(Node8 head)
    {
        Node8 odd = head;
        Node8 even = head.next;
        Node8 evenHead = head.next;

        while(even != null && even.next != null)
        {
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
    public static  void printList(Node8 head)
    {
        Node8 temp = head;
        while(temp != null)
        {
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args)
    {
        Node8 n1 = new Node8(1);
        Node8 n2 = new Node8(2);
        Node8 n3 = new Node8(3);
        Node8 n4 = new Node8(4);
        Node8 n5 = new Node8(5);
        Node8 n6 = new Node8(6);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = null;

        Node8 head = n1;

        head = odd_evenList(head);
        printList(head);

    }
}
