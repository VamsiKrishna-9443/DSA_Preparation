import java.util.*;
public class Peak_Element
{
    public static int PeakElement(int[] nums,int n)
    {
        if(n==1)
            return 0;
        if(nums[0]>nums[1])
            return 0;
        if(nums[n-1]>nums[n-2])
            return n-1;

        int low = 1;
        int high = n-2;
        while(low <= high)
        {
            int mid = low+(high-low)/2;
            if(nums[mid]> nums[mid-1] && nums[mid] > nums[mid+1])
            {
                return mid;
            } else if (nums[mid] > nums[mid-1]) {
                low = mid + 1;
            }
            else
            {
                high = mid -1 ;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n =  sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements in the array:");
        for (int i = 0; i < nums.length; i++) {
            nums[i]=sc.nextInt();
        }
        int ans = PeakElement(nums,n);
        System.out.println("Peak Element is :"+ nums[ans]);
        System.out.println("Peak element  index:"+ans);
    }
}
