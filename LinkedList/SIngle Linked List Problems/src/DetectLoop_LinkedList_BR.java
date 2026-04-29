import java.util.HashMap;

class Node4 {
    int data;
    Node4 next;

    Node4(int data1, Node4 next1) {
        this.data = data1;
        this.next = next1;
    }

    Node4(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class DetectLoop_LinkedList_BR{

    private static Node4 ConvertArr2LL(int[] arr) {
        Node4 head = new Node4(arr[0]);
        Node4 mover = head;

        for (int i = 1; i < arr.length; i++) {
            mover.next = new Node4(arr[i]);
            mover = mover.next;
        }
        return head;
    }

    // 🔥 Using HashMap<Node, Integer>
    public static boolean detectLoop(Node4 head) {
        HashMap<Node4, Integer> map = new HashMap<>();
        Node4 temp = head;
        int index = 0;

        while (temp != null) {
            if (map.containsKey(temp)) {
                return true; // loop detected
            }
            map.put(temp, index++);
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6};
        Node4 head = ConvertArr2LL(arr);

        // create loop
        Node4 temp = head;
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