// Node7 class
class Node7 {
    int data;
    Node7 next;

    Node7(int data1) {
        data = data1;
        next = null;
    }
}

class Solution {

    public int lengthOfLoop(Node7 head) {

        Node7 slow = head;
        Node7 fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
            {
                return countLoopLength(slow);
            }
        }

        return 0;
    }

    public int countLoopLength(Node7 meetingPoint)
    {
        Node7 temp = meetingPoint.next;

        int count = 1;

        while(temp != meetingPoint)
        {
            count++;
            temp = temp.next;
        }

        return count;
    }
}

public class LengthOf_Loop {

    public static void main(String[] args) {

        Node7 n1 = new Node7(1);
        Node7 n2 = new Node7(2);
        Node7 n3 = new Node7(3);
        Node7 n4 = new Node7(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2;

        Solution obj = new Solution();

        System.out.println(obj.lengthOfLoop(n1));
    }
}