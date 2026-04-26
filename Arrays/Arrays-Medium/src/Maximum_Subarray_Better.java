import java.util.*;
public class Maximum_Subarray_Better
{

    public static int maximum_subarray_sum(int[] arr){
        int n = arr.length;
        int maxi =0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                maxi = Math.max(sum,maxi);
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the values in the array: " );
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = maximum_subarray_sum(arr);
        System.out.println("Maximum subarray Sum:"+ans);
    }
}
