import java.util.*;
public class First_and_Last_Occurance
{
    public static  int[] Search_range(int[] nums,int n ,int x)
    {
        int first = First_Occurance(nums, n, x);
        if(first ==  -1)
        {
            return new int[]{-1,-1};
        }
        int last = Last_Occurance(nums, n, x);
        return new int[]{first,last};
    }
    public static  int First_Occurance(int[] nums,int n ,int x)
    {
        int low =0;
        int high = n-1;
        int first = -1;
        while(low <= high)
        {
            int mid = low +(high - low)/2;
            if(nums[mid] == x)
            {
                first = mid;
                high =  mid -1;
            } else if (nums[mid] < x) {
                low = mid +1;
            }
            else {
                high = mid -1 ;
            }
        }
        return first;
    }

    public static  int Last_Occurance(int[] nums,int n ,int x) {
        int low = 0;
        int high = n - 1;
        int last = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == x) {
                last = mid;
                low = mid + 1;
            } else if (nums[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return last;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("enter the array:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("enter the Target:");
        int x = sc.nextInt();
        int[] res = Search_range(nums,n,x);
        System.out.println(Arrays.toString(res));
    }
}
