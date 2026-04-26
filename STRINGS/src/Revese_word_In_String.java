import java.util.*;
public class Revese_word_In_String
{
    public static String Reverse_String(String s){
        String[] words = s.split(" +");
        StringBuilder result = new StringBuilder();

        for(int i = words.length-1;i >= 0;i--){
            result.append(words[i]);
            result.append(" ");
        }
        return result.toString().trim();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String: ");
        String input = sc.nextLine();
        String reversed =  Reverse_String(input);
        System.out.println("Reversed String is: "+reversed);
        sc.close();
    }
}
