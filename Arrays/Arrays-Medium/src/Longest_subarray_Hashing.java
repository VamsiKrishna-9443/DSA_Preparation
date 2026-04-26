import java.util.*;
public class Longest_subarray_Hashing {
    public static int subarray(int[] arr, long k){
        int n = arr.length;
        Map<Long, Integer> preSum = new HashMap<>();
        long sum = 0;
        int maxLen=0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if(sum == k){
                maxLen = Math.max(maxLen,i+1);
            }
            long rem = sum - k;
            if(preSum.containsKey(rem)){
                int len = i - preSum.get(rem);
                maxLen = Math.max(maxLen,len);
            }
            if(!preSum.containsKey(sum)){
                preSum.put(sum,i);
            }
        }
        return maxLen;
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
        System.out.println("enter the k element:");
        long k = sc.nextLong();
        int len = subarray(arr,k);
        System.out.println("Longest subarray: "+len);
    }
}
