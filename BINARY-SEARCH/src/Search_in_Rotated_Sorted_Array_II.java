import java.util.*;
public class Search_in_Rotated_Sorted_Array_II
{
    public static int Search(int[] nums,int n ,int x)
    {
        int low =0;
        int high = n-1;

        while(low<=high)
        {
            int mid =low+(high-low)/2;
            if(nums[mid] == x)
            {
                return mid;
            }

            if(nums[low]==nums[mid] && nums[mid]==nums[high])
            {
                low=low+1;
                high=high-1;
                continue;
            }
            // Left side is Sorted in the Array
            if(nums[low] <=nums[mid])
            {
                if(nums[low]<=x && x<=nums[mid])
                {
                    high = mid-1;
                }
                else{
                    low = mid +1;
                }
            }
            // IF RIGHT SIDE IS SORTED IN THE ARRAY
            else
            {
                if(nums[mid] <=x && x<=nums[high])
                {
                    low = mid+1;
                }
                else {
                    high = mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the Array Elements:");
        for(int i =0;i<nums.length;i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter the Target:");
        int x = sc.nextInt();
        int ans = Search(nums,n,x);
        if(ans == -1)
        {
            System.out.println("The Element is not present in the Array");
        }
        else {
            System.out.println("Element is present at index:"+ans);
        }
    }
}
