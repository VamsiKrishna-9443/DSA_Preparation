// Program to Print the HEAD ELEMENT OF THE LINKED LIST
import java.util.*;
class Node2 {
    int data;
    Node2 next;

    Node2(int data1, Node2 next1) {
        this.data = data1;
        this.next = next1;
    }

    Node2(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class LinkedList2 {

    private static Node2 convertArr2LL(int[] arr) {
        Node2 head = new Node2(arr[0]);
        Node2 mover = head;

        for (int i = 1; i < arr.length; i++) { // start from 1
            Node2 temp = new Node2(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        return head;
    }
    public static  int LengthofLL(Node2 head)       // Length of the Linked List
    {
        Node2 temp = head;
        int count = 0;
        while(temp != null)
        {
            temp = temp.next;
            count++;
        }
        return count;
    }
    public static Boolean CheckNumberPresent(Node2 head, int value)    // Check Number Present or Not
    {
        Node2 temp =  head;
        while(temp != null)
        {
            if(temp.data == value)
                return true;
            temp = temp.next;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 8};

        Node2 head = convertArr2LL(arr);

        // PRINT HEAD ELEMENT
        System.out.println("Head element: " + head.data);

        // TRAVERSAL IN THE LINKED LIST
        Node2 temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        // Length of the Linked List
        System.out.println("Length of the linked list:"+LengthofLL(head));

        // Check Number is present or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value: ");
        int value = sc.nextInt();
        System.out.println(CheckNumberPresent(head,value));
    }
}