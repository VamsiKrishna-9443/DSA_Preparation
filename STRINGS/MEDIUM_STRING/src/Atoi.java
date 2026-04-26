import java.util.*;
public class Atoi
{
    public static int String_To_Integer(String s)
    {
        // It removes the whitespace
        s = s.trim();
        long num = 0;
        if(s.isEmpty())
        {
            return 0;
        }
        int i = 0;
        int sign = 1;
        int n = s.length();

        // Signing
        if (s.charAt(i) == '-' || s.charAt(i) == '+')
        {
            sign = (s.charAt(i) == '-')?-1:1;
            i++;
        }

        while(i<n && Character.isDigit(s.charAt(i)))
        {
            num = num * 10 + (s.charAt(i) - '0');
            if(num *sign > Integer.MAX_VALUE)
            {
                return Integer.MAX_VALUE;
            }
            if(num*sign < Integer.MIN_VALUE)
            {
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int) (sign*num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s = sc.nextLine();
        System.out.println(String_To_Integer(s));

    }
}
