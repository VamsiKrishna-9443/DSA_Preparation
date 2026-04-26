// Largest element in the Array
import java.util.*;
public  class Largest_Element {
    static int FindLargest(int[] arr,int n) {
        int MAX=arr[0];
        for(int i=0;i<n;i++) {
            if (arr[i] > MAX) {
                MAX = arr[i];
            }
        }
        return MAX;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the value in the array:");
        for (int i = 0; i < arr.length ;i++) {
            arr[i]=sc.nextInt();
        }
        int Large=FindLargest(arr,n);
        System.out.println("Largest element in the array:"+Large);
    }
}
