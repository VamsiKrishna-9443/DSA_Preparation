import java.util.*;
public class Maximum_subarray_with_sum_k_OP {
    public static int Maximum_subarray(int[] arr)
    {
        int n = arr.length;
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if(sum > maxi){
                maxi = sum ;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the values of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = Maximum_subarray(arr);
        System.out.println("Maximum subarray sum:"+ans);
    }
}
