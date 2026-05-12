class Node {
    int data;
    Node next;
    Node back;

    Node(int data1, Node next1, Node back1)
    {
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    Node(int data1)
    {
        this.data = data1;
        this.next = null;
        this.back = null;
    }
}

public class Double_LinkedList
{
    // Delete head of the Linked List
    private static Node DeleteHead(Node head)
    {
        if(head == null || head.next == null)
        {
            return null;
        }
        Node prev = head;
        head = head.next;
        head.back = null;
        prev.next = null;

        return head;
    }
    // Delete the Tail  of the Doubly Linked List
    private static Node DeleteTail(Node head)
    {
        if(head == null || head.next ==  null)
        {
            return null;
        }
        Node tail = head;
        while(tail.next != null)
        {
            tail = tail.next;
        }
        Node newTail = tail.back;
        newTail.next = null;
        tail.back = null;
        return head;
    }

    // Convert Array to Doubly Linked List
    public static Node convertArr2DLL(int arr[])
    {
        Node head = new Node(arr[0]);
        Node prev = head;

        for(int i = 1; i < arr.length; i++)
        {
            Node temp = new Node(arr[i], null, prev);

            prev.next = temp;
            prev = temp;
        }

        return head;
    }

    // Print Doubly Linked List
    public static void print(Node head)
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + "<-->");
            temp = temp.next;
        }
    }

    public static void main(String[] args)
    {
        int arr[] = {10, 20, 30, 40, 50};
        Node head = convertArr2DLL(arr);
        head = DeleteTail(head);
        print(head);
    }
}