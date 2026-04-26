import java.util.*;
public class TwoSum_BR
{
    public  static int[] Sum(int[] arr,int n,int target){
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i]+arr[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the values of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the target: ");
        int target = sc.nextInt();
        int[] ans = Sum(arr,n,target);
        System.out.println("answer:"+ Arrays.toString(ans));
    }
}
