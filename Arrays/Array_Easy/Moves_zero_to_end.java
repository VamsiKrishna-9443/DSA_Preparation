package Array_Easy;// TWO POINTER METHOD
import java.util.*;
public class Moves_zero_to_end
{
    public static int[] Moves(int n, int[] arr){
        int j=-1;
        for(int i=0;i<n;i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        if (j == -1){
            return arr;
        }
        for (int i = j+1; i < n; i++) {
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        return  arr;

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the values in the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
         int[] ans=Moves(n,arr);
        for (int i = 0; i <= n; i++) {
            System.out.println(ans[i]+" ");
        }
        System.out.println(" ");
    }
}
