import java.util.*;
public class OuterMost_Parenthesis {
    public static String RemoveParenthesis(String str){
        StringBuilder result = new StringBuilder();
        int counter = 0;

        //traversal of the String
        for(int i=0;i < str.length();i++){
            char c = str.charAt(i);
            if( c == '('){
                if(counter > 0) result.append(c);
                counter++;
            }

            else if(c == ')'){
                counter--;
                if(counter > 0) result.append(c);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:");
        String str = sc.nextLine();
        String Output = RemoveParenthesis(str);
        System.out.println("after removing the parenthesis:"+Output);

    }
}
