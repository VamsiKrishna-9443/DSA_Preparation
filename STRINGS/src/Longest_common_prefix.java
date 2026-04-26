import java.util.*;
public class Longest_common_prefix
{
    public static String longest_common_Prefix(String[] input){
        Arrays.sort(input);
        String str1 = input[0];
        String str2 = input[input.length-1];
        int index = 0;

        while(index < str1.length() && index < str2.length())
        {
            if(str1.charAt(index) == str2.charAt(index))
                index++;
            else {
                break;
            }
        }
        return index==0?"":str1.substring(0,index);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of Strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] input = new String[n];
        System.out.println("enter the strings: ");
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextLine();
        }

        String result = longest_common_Prefix(input);
        System.out.println("Longest Common Prefix:" + result);
    }
}
