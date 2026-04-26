import java.util.*;

public class Sort_characters_by_frequency {
    public static String Sort_characters_by_frequency(String s) {
        // Step 1: Count frequencies
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        // Step 2: Sort characters by frequency (descending)
        List<Character> chars = new ArrayList<>(map.keySet());
        Collections.sort(chars, (a, b) -> map.get(b) - map.get(a));

        // Step 3: Build result string
        StringBuilder sb = new StringBuilder();
        for (Character ch : chars) {
            for (int i = 0; i < map.get(ch); i++) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(Sort_characters_by_frequency(s));
    }
}
