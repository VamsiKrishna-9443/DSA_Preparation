package Array_Easy;

import java.util.*;

public class Middle_index_Array
{
    public static int Middle_index(int[] arr)
    {
        int n = arr.length;
        int totalSum = 0;

        // Calculate total sum
        for(int num : arr)
        {
            totalSum += num;
        }

        int leftSum = 0;

        // Find middle index
        for(int i = 0; i < n; i++)
        {
            int rightSum = totalSum - leftSum - arr[i];

            if(leftSum == rightSum)
            {
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Array Size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements into the array:");

        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Middle Index: " + Middle_index(arr));
        sc.close();
    }
}