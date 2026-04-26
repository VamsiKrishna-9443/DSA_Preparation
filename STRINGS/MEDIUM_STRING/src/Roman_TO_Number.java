import java.util.*;
public class Roman_TO_Number
{
    public static int Roman_to_Number(String s)
    {
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);

        int result = hm.get(s.charAt(s.length() - 1));
        for (int i = s.length() - 2; i >=0 ; i--)
        {
            if(hm.get(s.charAt(i)) < hm.get(s.charAt(i+1)))
            {
                result = result - hm.get(s.charAt(i));
            }
            else
            {
                result += hm.get(s.charAt(i));
            }
        }
        return result;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String: ");
        String s = sc.nextLine();
        System.out.println(Roman_to_Number(s));
    }
}
