import java.util.*;
public class Armstrong_number
{
    public static Boolean ArmStrong(int n){
        int originalnumber = n;
        int  count = 0;
        int result = 0;
        int temp = n;

        //Count the digits
        while(temp > 0){
            count++;
            temp= temp/10;
        }

        temp = n;
        while(temp > 0){
            int digit = temp % 10;
            result += Math.pow(digit,count);
            temp = temp/10;
        }
        temp=n;
        return result==temp;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt();

        if(ArmStrong(n)){
            System.out.println("The number is armstrong");
        }
        else {
            System.out.println("The number is not armstsrong");
        }

    }
}
