import java.util.*;
public class SearchInsert
{
    public static int Search_Insert(int[] arr,int x)
    {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int ans = n;

        while(low <= high)
        {
            int mid = low + (high -low)/2;
            if(arr[mid] >= x)
            {
                ans = mid;
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
        System.out.println("enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the numbers in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the target: ");
        int x = sc.nextInt();
        System.out.println(Search_Insert(arr,x));
    }
}
