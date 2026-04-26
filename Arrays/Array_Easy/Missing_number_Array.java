package Array_Easy;

import java.util.*;

public class Missing_number_Array {
    public static int Missing(int n, int[] arr) {
        int expectedSum = (n * (n + 1)) / 2;  // Sum of 1 to n
        int actualSum = 0;
        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }
        return expectedSum - actualSum;  // The missing number
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n (the largest number in the range):");
        int n = sc.nextInt();

        int[] arr = new int[n - 1];  // Only n-1 elements should be entered
        System.out.println("Enter " + (n - 1) + " numbers from 1 to " + n + " (one missing):");
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        int missing = Missing(n, arr);
        System.out.println("The missing number is: " + missing);
    }
}
