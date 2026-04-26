import java.util.*;
public class ISomorphic_string
{
    public static Boolean Isomorphic(String s ,String t){
        if(s.length() != t.length()){
            return  false;
        }

        // Create a HashMap to store character mappings.
        HashMap<Character,Character>  hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {

            char original = s.charAt(i);
            char replace  = t.charAt(i);
            if(!hm.containsKey(original)){
                if(!hm.containsKey(replace))
                    hm.put(original,replace);
                else
                    return false;
            }
            else{
                char mappedcharacter = hm.get(original);
                if(mappedcharacter != replace)
                    return false;
            }
        }
        return true;
    }

    public static void  main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter the String 1:");
        String s = sc.nextLine();
        System.out.println("enter the String 2:");
        String t = sc.nextLine();

        if(Isomorphic(s,t)){
            System.out.println("Strings are Isomorphic ");
        }
        else{
            System.out.println("Not Isomorphic strings");
        }
    }
}
