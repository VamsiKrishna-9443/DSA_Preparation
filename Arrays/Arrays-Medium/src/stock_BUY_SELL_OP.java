import java.util.*;
public class stock_BUY_SELL_OP
{
    public static int maxProfit(int[] arr){
        int  n = arr.length;
        int maxPro = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            minPrice = Math.min(minPrice, arr[i]);
            maxPro = Math.max(maxPro, arr[i] - minPrice);
        }
        return maxPro;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the stocks: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the values into the arrray: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = maxProfit(arr);
        System.out.println(ans);
    }
}
