import java.util.*;
public class K_Missing_Number
{
    public static int K_MissingNumber(int[] arr,int K)
    {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(low <= high)
        {
            int mid = low +(high - low )/2;
            int Missing = arr[mid] - (mid+1);
            if(Missing < K)
            {
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return low+K;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements in the Array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the K the Element:");
        int K = sc.nextInt();
        int ans = K_MissingNumber(arr,K);
        System.out.println("The K the Element is :"+ans);
    }
}
