import java.util.*;
public class Majority_Element_Br
{
    public static int Majorelement(int[] arr,int n){
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if(arr[j] == arr[i])
                {
                    count+=1;
                }
            }
            if(count > n/2)
                return arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the values in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int major = Majorelement(arr,n);
        System.out.println("Major element: " + major);
    }
}
