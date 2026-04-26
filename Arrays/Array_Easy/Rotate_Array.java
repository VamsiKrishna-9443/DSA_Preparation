package Array_Easy;

import java.util.*;
public class Rotate_Array
{
    public static void rotate(int[] arr, int k){
        int n=arr.length;
        int[] result=new int[n];
        for(int i=0;i<n;i++){
            result[(i+k)%n]=arr[i];
        }
        for(int i=0;i<n;i++){
            arr[i]=result[i];
        }
        System.out.println("Rotated array:"+Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the  values in the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("enter the K:");
        int k=sc.nextInt();
        rotate(arr,k);

    }
}
