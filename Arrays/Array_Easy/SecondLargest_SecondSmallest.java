package Array_Easy;// Second Largest and Second Smallest in an array

import java.util.Scanner;
public  class SecondLargest_SecondSmallest {
    static  private  int SecondSmallest(int[] arr,int n){
        if(n < 2) return -1;
        int small=Integer.MAX_VALUE;
        int Second_Small=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){

            if(arr[i]< small)
            {
                Second_Small=small;
                small=arr[i];
            } else if (arr[i]<Second_Small && arr[i]!=small) {
                Second_Small=arr[i];
            }
        }
        return Second_Small;
    }
    static  private int SecondLargest(int[] arr,int n){
        if(n < 2) return -1;
        int large=Integer.MIN_VALUE;
        int second_large=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i] > large){
                second_large=large;
                large=arr[i];
            } else if (arr[i] > second_large && arr[i]!=large) {
                second_large=arr[i];
            }
        }
        return second_large;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the elements into the array:");
        for(int i=0;i< arr.length;i++)
            {
                arr[i]= sc.nextInt();
            }
        int Ss=SecondSmallest(arr ,n);
        int Sl=SecondLargest(arr,n);
        System.out.println("Second Largest:"+Sl);
        System.out.println("Second Smallest:"+Ss);
    }
}