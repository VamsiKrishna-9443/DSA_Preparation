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

public class Reverse_LinkedList {

    private static Node2 ConvertArr2LL(int[] arr) {
        Node2 head = new Node2(arr[0]);
        Node2 mover = head;

        for (int i = 1; i < arr.length; i++) {
            Node2 temp = new Node2(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    private static void print(Node2 head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    // Iterative
    public static Node2 reverseIterative(Node2 head) {
        Node2 prev = null;
        Node2 temp = head;

        while (temp != null) {
            Node2 front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }

        return prev;
    }

    // Recursive
    public static Node2 reverseRecursive(Node2 head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node2 newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6};

        Node2 head = ConvertArr2LL(arr);

        System.out.print("Original: ");
        print(head);

        // Iterative
        head = reverseIterative(head);
        System.out.print("Iterative Reverse: ");
        print(head);

        // Recursive (reverse back)
        head = reverseRecursive(head);
        System.out.print("Recursive Reverse: ");
        print(head);
    }
}