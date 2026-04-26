package Array_Easy;

import java.util.*;
public class Remove_duplicates
{
    public static int remove(int n, int[] arr){
        int i=0;
        for(int j=1;j<n;j++){
        if(arr[i]!=arr[j]){
            i++;
            arr[i]=arr[j];
        }
        }
        return  i+1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the values in the array:");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        int l=remove(n,arr);
        for (int i = 0; i < l; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
