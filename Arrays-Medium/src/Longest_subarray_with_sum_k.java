import java.util.*;
public class Longest_subarray_with_sum_k {
    public static int Longest_subarray(int[] arr,int K){
        int n = arr.length;
        int len = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];

                if(sum == K){
                    len = Math.max(len,(j - i) + 1);
                }
            }

        }
        return len;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the values of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the k element:");
        int K =sc.nextInt();
        System.out.println(Longest_subarray(arr,K));
    }
}
