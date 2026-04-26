import java.util.*;
public class Anagram_String
{
    public static boolean IsAnagram(String s, String goal)
    {
        if(s.length() != goal.length())
        {
            return false;
        }
        else
        {
            int[] count = new int[26];
            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 'a']++;
                count[goal.charAt(i) - 'a']--;
            }

            for (int i = 0; i < count.length; i++) {
                if(count[i] != 0)
                {
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String 1:");
        String s = sc.nextLine();
        System.out.println("enter the String 2:");
        String goal = sc.nextLine();
        System.out.println(IsAnagram(s,goal));
    }
}
