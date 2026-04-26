import java.util.*;
public class Minimum_in_Sorted_Array
{
    public static int Minimum(int[] nums,int n)
    {
        int low =0;
        int high=n-1;
        int ans=Integer.MAX_VALUE;

        while(low<=high)
        {
            int mid =low+(high-low)/2;
            if(nums[low] <= nums[mid])
            {
                ans = Math.min(ans,nums[low]);
                low=mid+1;
            }
            else {
                ans=Math.min(ans,nums[mid]);
                high=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ente rthe size of the Array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements in the array:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int ans = Minimum(nums,n);
        System.out.println("Minimum in the array:" + ans);
    }
}
