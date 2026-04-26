package Array_Easy;// MAXIMUM CONSECUTIVE ONES IN AN ARRAY
import java.util.*;
public class Maximum_Consecutive_ones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the values in the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        consecutive(arr);
    }
        public static void consecutive (int[] arr){
            int count = 0;
            int maxi = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1) {
                    count++;
                    maxi = Math.max(maxi, count);
                } else {
                    count = 0;
                }
            }
            System.out.println("MAX:" + maxi);
        }
    }

