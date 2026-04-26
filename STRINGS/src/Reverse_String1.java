public class Reverse_String1
{
    public static boolean reverse_string(String s, String goal)
    {
        return s.length() == goal.length() && (s+s).contains(goal);
    }
    public static void main(String[] args) {
        String s = "abcde";
        String goal ="cdeab";
        System.out.println(reverse_string(s,goal));
    }
}
