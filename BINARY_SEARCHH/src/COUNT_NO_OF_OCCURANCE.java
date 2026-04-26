import java.util.*;

public class COUNT_NO_OF_OCCURANCE {

    public static int count_occurance(int[] nums, int n, int x) {
        int first = First(nums, n, x);
        if (first == -1)
            return -1; // not found
        int last = Last(nums, n, x);
        return (last - first) + 1;
    }

    public static int First(int[] nums, int n, int x) {
        int low = 0, high = n - 1, ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == x) {
                ans = mid;
                high = mid - 1; // move left to find earlier occurrence
            } else if (nums[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static int Last(int[] nums, int n, int x) {
        int low = 0, high = n - 1, ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == x) {
                ans = mid;
                low = mid + 1; // move right to find later occurrence
            } else if (nums[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Array Size: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the Array Elements (sorted): ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter the target:");
        int x = sc.nextInt();

        int count = count_occurance(nums, n, x);
        if (count == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Count of " + x + " is: " + count);
        }
    }
}
