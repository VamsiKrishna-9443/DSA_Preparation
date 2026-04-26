package Array_Easy;

import java.util.*;
public class ROTATED_SORTED_ARRAY
{
    public static  boolean check(int n,int[] arr){
        int count=0;
        for (int i = 0; i < n; i++) {
            if(arr[i] > arr[(i+1) % n] ){
                count++;
            }
        }
        if(count > 1){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the values in the array:");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(check(n,arr));
    }
}