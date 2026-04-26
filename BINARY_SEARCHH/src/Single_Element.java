import java.util.*;
public class Single_Element {
    public static int findSingleElement(int[] nums, int n) {
        if (n == 1)
            return nums[0];
        else if (nums[0] != nums[1])
            return nums[0];
        else if (nums[n - 1] != nums[n - 2])
            return nums[n - 1];

        int low = 1;
        int high = n - 2;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1]) {
                return nums[mid];
            }

            // Left half check
            if ((mid % 2 == 1 && nums[mid - 1] == nums[mid]) ||
                    (mid % 2 == 0 && nums[mid] == nums[mid + 1])) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the Elements in the array:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Single element is: " + findSingleElement(nums, n));
    }
}
