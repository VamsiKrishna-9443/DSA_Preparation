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

public class LinkedList4 {

    private static Node4 ConvertArr2LL(int[] arr) {
        Node4 head = new Node4(arr[0]);
        Node4 mover = head;

        for (int i = 1; i < arr.length; i++) {  // start from 1
            Node4 temp = new Node4(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static Node4 insertHead(Node4 head, int newData) {
        Node4 newNode = new Node4(newData, head);
        return newNode;
    }
    public static Node4 insertTail(Node4 head, int newData){
        if(head ==  null)
            return new Node4(newData);
        Node4 temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        Node4 newNode =  new Node4(newData);
        temp.next =  newNode;
        return head;

    }

    public static Node4 insertPostion(Node4 head, int newData , int k)
    {
        if(head == null)
        {
            if(k == 1)
                return new Node4(newData);
            else
                return null;
        }
        if(k == 1)
        {
            Node4 temp = new Node4(newData,head);
            return temp;
        }
        int cnt = 0;
        Node4 temp = head;
        while(temp != null)
        {
            cnt++;
            if(cnt == k - 1)
            {
                Node4 newNode = new Node4(newData);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    public static Node4 insertBeforeVal(Node4 head, int el, int val) {
        // Case 1: Empty list
        if (head == null) {
            return null;
        }

        // Case 2: Insert before head
        if (head.data == val) {
            return new Node4(el, head);
        }

        Node4 temp = head;

        // Traverse list
        while (temp.next != null) {
            if (temp.next.data == val) {
                Node4 newNode = new Node4(el, temp.next);
                temp.next = newNode;
                return head;
            }
            temp = temp.next;
        }

        // Value not found
        return head;
    }
    public static void printLL(Node4 head) {
        Node4 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Node4 head = ConvertArr2LL(arr);
        head = insertBeforeVal(head, 6,3); // insert at beginning
        printLL(head);
    }
}