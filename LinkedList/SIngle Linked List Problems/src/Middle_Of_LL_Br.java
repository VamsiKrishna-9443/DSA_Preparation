class Node1 {
    int data;
    Node1 next;

    Node1(int data1, Node1 next1) {
        this.data = data1;
        this.next = next1;
    }

    Node1(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class Middle_Of_LL_Br {

    public static Node1 MiddelOfLL(Node1 head) {
        Node1 temp = head;
        int count = 0;

        // Step 1: Count nodes
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // Step 2: Find middle position
        int MiddleNode = (count / 2) + 1;

        // Step 3: Traverse again
        Node1 temp1 = head;
        while (temp1 != null) {
            MiddleNode--;
            if (MiddleNode == 0)
                break;
            temp1 = temp1.next;
        }

        return temp1;  // FIXED
    }

    private static Node1 ConvertArr2LL(int[] arr) {
        Node1 head = new Node1(arr[0]);
        Node1 mover = head;

        for (int i = 1; i < arr.length; i++) {
            Node1 temp = new Node1(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        return head;
    }

    private static void print(Node1 head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        Node1 head = ConvertArr2LL(arr);
        print(head);

        Node1 middle = MiddelOfLL(head);
        System.out.println("Middle: " + middle.data);
    }
}