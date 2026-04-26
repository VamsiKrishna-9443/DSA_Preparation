import java.util.*;
public class Reverse_String
{
    public static boolean Reverse_string(String s, String goal){
        if(s.length() != goal.length()){
            return false;
        }
        else if((s+s).contains(goal))
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "abcde";
        String goal ="cdeab";
        System.out.println(Reverse_string(s,goal));
    }
}
