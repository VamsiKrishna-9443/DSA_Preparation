import java.util.*;
public class Maximum_Depth_Of_String
{
    public static int Maximum_depth(String s)
    {
        int res = 0, curr = 0;

        // Traversal in the  String
        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == '(')
            {
                curr++;
                res = Math.max(res,curr);
            }
            else if(ch == ')')
            {
                curr--;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String:");
        String s = sc.nextLine();
        System.out.println(Maximum_depth(s));
    }
}
