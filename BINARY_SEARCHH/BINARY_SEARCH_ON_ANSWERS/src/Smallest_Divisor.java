import java.util.*;
public class Smallest_Divisor
{
    public static int Sum(int[] nums,int d)
    {
        int n = nums.length;
        int sum =0;
        for (int i = 0; i < n; i++) {
            sum += Math.ceil((double) nums[i]/ (double) d);
        }
        return sum;
    }
    public static int Smallest_Divisor(int[] nums,int k)
    {
        int n =  nums.length;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi,nums[i]);
        }

        int low = 1 ,high=maxi;
        while(low<=high)
        {
            int mid =low +(high-low)/2;
            if(Sum(nums,mid) <= k)
            {
                high = mid-1;
            }
            else {
                low = mid +1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements into the array:");
        for (int i = 0; i < n; i++) {
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter the Threshold Value:");
        int k = sc.nextInt();
        int ans = Smallest_Divisor(nums,k);
        System.out.println("Smallest Divisor:"+ans);
    }
}
