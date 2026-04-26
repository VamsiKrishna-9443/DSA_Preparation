import java.util.*;
public class Largest_oddNumber_String
{
    public static String Largest_oddNumber(String num){
        for(int i = num.length()-1;i >= 0;i--){
            if((num.charAt(i) -'0')%2!=0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:");
        String num = sc.nextLine();
        String output = Largest_oddNumber(num);
        System.out.println("Largest odd number :" + output);
    }
}
