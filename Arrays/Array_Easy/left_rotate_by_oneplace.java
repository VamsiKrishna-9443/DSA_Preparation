package Array_Easy;

import java.util.*;
public class left_rotate_by_oneplace {
    public static  void left_rotate(int[] arr){
        int n=arr.length;
        if(n == 0)
            return;
        int temp=arr[0];
        for(int i=1;i < n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        left_rotate(arr);
        for (int i= 0; i < arr.length ; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}
