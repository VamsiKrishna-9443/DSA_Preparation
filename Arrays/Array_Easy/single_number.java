package Array_Easy;

import  java.util.*;
public class single_number
{
    public static  int  single(int n,int[] arr){
        int xor1=0;
        for (int i = 0; i < n; i++) {
            xor1=xor1^arr[i];
        }
        return xor1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the values of the array:");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("single number:"+single(n,arr));
    }
}
