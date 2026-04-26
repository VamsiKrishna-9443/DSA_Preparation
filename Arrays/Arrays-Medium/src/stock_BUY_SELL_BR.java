import java.util.*;
public class stock_BUY_SELL_BR {
    public static int maxProfit(int[] arr) {
        int n =  arr.length;
        int maxPro = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n ; j++) {
                if( arr[j]  > arr[i]){
                    int profit = arr[j] - arr[i] ;
                    maxPro = Math.max(maxPro,profit);
                }
            }
        }
        return maxPro;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of stocks:");
        int n =  sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elmnets into the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxPro = maxProfit(arr);
        System.out.println("Max Profit is: " +maxPro);
    }
}
