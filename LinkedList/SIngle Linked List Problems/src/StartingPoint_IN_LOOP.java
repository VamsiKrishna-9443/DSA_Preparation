class Node5 {
    int data;
    Node5 next;

    Node5(int data1, Node5 next1) {
        this.data = data1;
        this.next = next1;
    }

    Node5(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class StartingPoint_IN_LOOP {

    public static Node5 ConvertArr2LL(int[] arr) {
        Node5 head = new Node5(arr[0]);
        Node5 mover = head;

        for (int i = 1; i < arr.length; i++) {
            Node5 temp = new Node5(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    // 🔁 Create loop manually (tail -> position)
    public static void createLoop(Node5 head, int pos) {
        if (pos == -1) return;

        Node5 temp = head;
        Node5 loopNode = null;
        int count = 0;

        while (temp.next != null) {
            if (count == pos) loopNode = temp;
            temp = temp.next;
            count++;
        }

        temp.next = loopNode; // create loop
    }

    // 🔍 Detect starting point of loop
    public static Node5 detectCycle(Node5 head) {
        Node5 slow = head;
        Node5 fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                slow = head;

                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow; // starting point
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};
        Node5 head = ConvertArr2LL(arr);

        createLoop(head, 2); // loop at index 2 (value = 4)

        Node5 result = detectCycle(head);

        if (result != null) {
            System.out.println("Loop starts at: " + result.data);
        } else {
            System.out.println("No loop");
        }
    }
}