import java.util.*;
public class Reverse_number
{
    public static int Reverse_Number(int num){
        int rev = 0;
        int ld ;

        while(num > 0){
            ld = num % 10;
            rev =  (rev * 10)+ ld;
            num=num/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = sc.nextInt();
        int reversednumber = Reverse_Number(num);
        System.out.println("reversed number:"+reversednumber);
    }
}
