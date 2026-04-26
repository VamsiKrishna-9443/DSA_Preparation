import java.util.*;
public class Floor_and_CEIL_ARRAY
{
    public static int floor(int[] arr, int n ,int x)
    {
        int ans = n;
        int low = 0;
        int high = n - 1;

        while(low <= high)
        {
            int mid = low +(high -low)/2;
            if(arr[mid] <= x)
            {
                ans = arr[mid];
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static int ceil(int[] arr, int n ,int x)
    {
        int ans = n;
        int low = 0;
        int high = n - 1;

        while(low <= high)
        {
            int mid = low +(high -low)/2;
            if(arr[mid] >= x)
            {
                ans = arr[mid];
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array Elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Target:");
        int x = sc.nextInt();
        int f = floor(arr,n,x);
        int c = ceil(arr,n,x);
        System.out.println("Floor :" + f +"Ceil:" + c);
    }
}
