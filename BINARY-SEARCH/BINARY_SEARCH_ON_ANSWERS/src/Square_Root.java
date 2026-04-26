import java.util.*;
public class Square_Root
{
    public static int Square(int n)
    {
        int low = 1 ;
        int high = n;
        int ans =  1;

        while (low <= high)
        {
            int mid = low + (high - low )/2;
            int val = mid*mid;
            if(val <=n)
            {
                ans = mid;
                low = mid +1;
            }
            else {
                high = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        System.out.println("Square root of n:"+Square(n));
    }
}
