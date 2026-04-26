import java.util.*;
public class Longest_common_prefix1
{
    public static  String longest_commonPrefix(String[] s){
        Arrays.sort(s);
        StringBuilder result = new StringBuilder();

        String first = s[0];
        String last = s[s.length - 1];

        for (int i = 0; i < first.length(); i++) {
            if(first.charAt(i) != last.charAt(i))
                break;
            result.append(first.charAt(i));
        }
        return result.toString();
    }
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         System.out.println("enter the number of Strings: ");
         int n = sc.nextInt();
         sc.nextLine(); 

         String[] input = new String[n];
         System.out.println("enter the Strings:");
         for (int i = 0; i < n; i++) {
             input[i] = sc.nextLine();
         }

         String result = longest_commonPrefix(input);
         System.out.println("lingest common prefix :"+result);
    }
}
