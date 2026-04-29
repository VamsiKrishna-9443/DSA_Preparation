class Node3 {
    int data;
    Node3 next;

    Node3(int data1, Node3 next1) {
        this.data = data1;
        this.next = next1;
    }

    Node3(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class DetectLOOP_LinkedList {

    // Convert array to Linked List
    private static Node3 ConvertArr2LL(int[] arr) {
        Node3 head = new Node3(arr[0]);
        Node3 mover = head;

        for (int i = 1; i < arr.length; i++) {
            mover.next = new Node3(arr[i]);
            mover = mover.next;
        }
        return head;
    }

    // 🔥 Detect loop using Slow & Fast pointer
    public static boolean detectLoop(Node3 head) {
        Node3 slow = head;
        Node3 fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6};
        Node3 head = ConvertArr2LL(arr);

        // create loop
        Node3 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head.next.next;

        if (detectLoop(head)) {
            System.out.println("Loop detected");
        } else {
            System.out.println("No loop detected");
        }
    }
}