import java.util.*;
public class Least_Capacity_Ship
{
    public static int FindDays(int[] weights,int capacity)
    {
        int day = 1,load=0;
        int n= weights.length;
        for (int i = 0; i < n; i++) {
            if(load +weights[i] > capacity)
            {
                day = day + 1;
                load = weights[i];
            }
            else {
                load += weights[i];
            }
        }
        return day;
    }
    public static  int LeasT_capacity_Ship(int[] weights,int days)
    {
        int low = Integer.MIN_VALUE,high=0;  // Capcity = From the Maximum TO The Sum
        int n= weights.length;
        for (int i = 0; i < n; i++) {
            high += weights[i];
            low =Math.max(low,weights[i]);
        }

        while(low <= high)
        {
            int mid = low + (high - low)/2;
            int No_Of_days=FindDays(weights,mid);
            if(No_Of_days <= days)
            {
                high= mid -1;
            }
            else {
                low = mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the  Array:");
        int n = sc.nextInt();
        int[] weights = new int[n];
        System.out.println("enter the elements into the array:");
        for (int i = 0; i < weights.length; i++) {
            weights[i]=sc.nextInt();
        }
        System.out.println("Enter the Number of  the Days :");
        int days = sc.nextInt();
        int ans = LeasT_capacity_Ship(weights,days);
        System.out.println("Least capacity of the Ship:" + ans);
    }
}
