//Leaders in the Array
import java.util.*;
public class leaders_in_Array
{
    public static ArrayList<Integer> leaders(int[] arr,int n){
        ArrayList<Integer> ans = new ArrayList<>();
        int maxi = arr[n - 1];
        ans.add(arr[n - 1]);
        for(int i= n - 2;i >= 0;i--){
            if(arr[i] > maxi){
                ans.add(arr[i]);
                maxi = arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size:");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the values:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> ans=leaders(arr,n);
        Collections.sort(ans,Collections.reverseOrder());
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i)+ " ");
        }
    }
}
