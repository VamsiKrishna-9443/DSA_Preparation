//MINIMUM NUMBER OF DAYS TO MAKE M BOUQETS
import java.util.*;
public class MINIMUM_BOQUETS
{
    public static Boolean possible(int[] nums,int day,int m,int k)
    {
        int n=nums.length;
        int count=0;
        int No_of_B=0;
        for(int i =0;i<n;i++)
        {
            if(nums[i]<=day)
                count++;
            else {
                No_of_B += (count/k);
                count=0;
            }
        }
        No_of_B += (count/k);
        return No_of_B >= m;
    }
    public static int RoseGarden(int[] nums,int m ,int k)
    {
        int n = nums.length;
        long val = (long) m*k;
        if(val>n)
            return -1;

        int mini=Integer.MAX_VALUE,maxi=Integer.MIN_VALUE;
        for(int i =0;i<n;i++)
        {
            mini=Math.min(nums[i],mini);
            maxi=Math.max(nums[i],maxi);
        }

        int low =mini,high=maxi,ans=high;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(possible(nums,mid,m,k) == true)
            {
                ans=mid;
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return low ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size :");
        int n=sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Ente rthe elements in the array:");
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.println("enter the Number of Bouqets:");
        int m=sc.nextInt();
        System.out.println("enter the adjacent flowers :");
        int k=sc.nextInt();
        int ans = RoseGarden(nums,m,k);
        if(ans==-1)
        {
            System.out.println("No Enough flowers for Bouqets");
        }
        else {
            System.out.println("minimum days to bloom flowers for bouqets:"+ans);
        }
    }
}
