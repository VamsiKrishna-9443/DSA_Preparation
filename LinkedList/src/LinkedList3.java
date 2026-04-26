import java.util.Scanner;

//  Program to Print the HEAD ELEMENT OF THE LINKED lIST
class Node3
{
    int data;
    Node3 next;
    Node3(int data1, Node3 next1)
    {
        this.data = data1;
        this.next = next1;
    }
    Node3(int data1)
    {
        this.data = data1;
        this.next = null;
    }
}
public class LinkedList3 {
    private static void print(Node3 head) // print the new Linked List
    {
        while(head != null)
        {
            System.out.print(head.data +" ");
            head = head.next;
        }
        System.out.println();
    }
    private static Node3 removesHead(Node3 head)   // Deletion of the head in the linked list
    {
        if(head == null)
            return head;
        head = head.next;
        return head;
    }
    private  static Node3 removeTail(Node3 head)     // Deletion of the Tail in the Linked list
    {
        if(head == null || head.next == null)
            return null;
        Node3 temp = head;
        while(temp.next.next != null)
        {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
    private static Node3 RemoveK(Node3 head,int k){      //Remove the K th element of the Linked list
        if(head == null)
            return head;
        if(k == 1)
        {
            head = head.next;
            return head;
        }
        int cnt = 0;
        Node3 prev = null;
        Node3 temp = head;
        while(temp != null)
        {
            cnt++;
            if(cnt == k)
            {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
    private static Node3 convertArr2LL(int[] arr)
    {
        Node3 head = new Node3(arr[0]);
        Node3 mover = head;
        for(int i=1;i<arr.length;i++)
        {
            Node3 temp = new Node3(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    public static void main() {
        int[] arr = {2,5,6,8};
        Node3 head = convertArr2LL(arr);
        head = RemoveK(head,1);
        print(head);
    }
}
