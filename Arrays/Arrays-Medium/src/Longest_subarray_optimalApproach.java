import java.util.*;
public class Longest_subarray_optimalApproach
{
    public static int subarray(int[] arr, long  k){
        int n =arr.length;
        int left = 0, right = 0;
        int sum = arr[0];
        int maxlen = 0;

        while (right < n){
            while(left <= right && sum > k){
                sum -= arr[left];
                left++;
            }
            if(sum == k){
                maxlen = Math.max(maxlen,right - left + 1);
            }
            right++;
            if(right < n)
                sum += arr[right];
        }
        return maxlen;
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
        System.out.println("enter the value of the k element:");
        long k = sc.nextLong();
        int len = subarray(arr,k);
        System.out.println("Longest sub array : " + len);
    }
}
