package Array_Easy;// Check if Array Is Sorted
import java.util.*;
public class p3
{
    static boolean Is_Sorted(int arr[],int n){
        for(int i=0;i<n;i++){
            if(arr[i] > arr[i+1])
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the values in the array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Is_Sorted(arr,n));
    }
}
