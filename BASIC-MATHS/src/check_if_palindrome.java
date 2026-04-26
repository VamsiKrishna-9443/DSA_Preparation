import java.util.*;
public class check_if_palindrome
{
    public static  boolean check_palindrome(int n){
        int rev = 0;
        int original = n;
        while(n > 0)
        {
            int ld = n % 10;
            rev = (rev * 10) + ld;
            n = n / 10;
        }
        if(original == rev){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt();
        System.out.println(check_palindrome(n));
    }
}
