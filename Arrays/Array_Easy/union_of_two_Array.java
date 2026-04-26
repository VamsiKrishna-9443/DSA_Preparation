package Array_Easy;
import java.util.*;
public class union_of_two_Array {
    public static void union(int[] arr1,int[] arr2 ,int m ,int n){
        Set<Integer> unionset = new HashSet<>();

        for(int num : arr1){
            unionset.add(num);
        }

        for(int num : arr2){
            unionset.add(num);
        }
        System.out.println("Union of arrays:" + unionset);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array1 size:");
        int n = sc.nextInt();
        System.out.println("enter the array2 size:");
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("enter the values of arr1:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int[] arr2 = new int[m];
        System.out.println("enter the values of arr2:");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        union(arr1,arr2,m,n);
    }
}
