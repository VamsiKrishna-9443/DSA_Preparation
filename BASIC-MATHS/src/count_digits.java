import java.util.*;
public class count_digits
{
    public static int countNumbers(int n){
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        int digits=countNumbers(n);
        System.out.println("count:"+digits);
    }
}