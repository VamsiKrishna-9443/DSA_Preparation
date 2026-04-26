import java.util.*;
public class Maximum_subarray_Br {

    public static int Max_subarray(int[] arr){
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n ; j++) {
                int sum =0;
                for (int k = i; k <=j ; k++) {
                    sum += arr[k];
                    maxi = Math.max(sum,maxi);
                }
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the values in the array:");
        for (int i = 0; i < n; i++) {
            arr[i] =  sc.nextInt();
        }
        int ans = Max_subarray(arr);
        System.out.println("Maximum subarray sum:"+ans);
    }
}
