class Node6 {
    int data;
    Node6 next;

    Node6(int data1, Node6 next1) {
        this.data = data1;
        this.next = next1;
    }

    Node6(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class Palindrome_LinkedList {

    public static void PrintLinkedList(Node6 head) {
        Node6 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node6 reverseLinkedList(Node6 head) {
        if (head == null || head.next == null)
            return head;

        Node6 newHead = reverseLinkedList(head.next);

        Node6 front = head.next;
        front.next = head;
        head.next = null;

        return newHead;
    }

    public static boolean isPalindrome(Node6 head) {
        if (head == null || head.next == null)
            return true;

        Node6 slow = head;
        Node6 fast = head;

        // Find middle
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node6 newHead = reverseLinkedList(slow.next);

        Node6 first = head;
        Node6 second = newHead;

        // Compare
        while (second != null) {
            if (first.data != second.data) {
                reverseLinkedList(newHead); // restore
                return false;
            }
            first = first.next;
            second = second.next;
        }

        reverseLinkedList(newHead); // restore
        return true;
    }

    public static void main(String[] args) {
        Node6 head = new Node6(1);
        head.next = new Node6(2);
        head.next.next = new Node6(5);
        head.next.next.next = new Node6(5);
        head.next.next.next.next = new Node6(2);
        head.next.next.next.next.next = new Node6(1);

        System.out.println("Original Linked List:");
        PrintLinkedList(head);

        if (isPalindrome(head)) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}