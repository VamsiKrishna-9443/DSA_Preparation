import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.*;
public class KOKO_EATING_BANANAS
{
    // TO FIND THE LARGEST ELEMENT IN THE ARRAY
    public static int Findmax(int[] nums) {
        int n = nums.length;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (nums[i] > maxi)
                maxi = nums[i];
        }
        return maxi;
    }
    public static int TotalHours(int[] nums ,int h)
    {
        int TotalHours=0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            TotalHours += Math.ceil((double)(nums[i]) / (double) (h));
        }
        return TotalHours;
    }

    public static int Minimum_RateTo_EatBananas(int[] nums,int h)
    {
        int low = 1;
        int high =Findmax(nums);
        while(low <= high)
        {
            int mid = low +(high - low )/2;
            int TotalHours = TotalHours(nums,mid);
            if(TotalHours <= h)
            {
                high =  mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return low ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the Elements into the Array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter The Hours:");
        int  h = sc.nextInt();
        int  x = Minimum_RateTo_EatBananas(nums,h);
        System.out.println("Koko should eat at least " + x+ " bananas/hr.");

    }
}
