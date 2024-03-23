import java.util.HashMap;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Main o = new Main();

        System.out.println(o.wordPattern("aaa", "aa aa aa aa"));

    }
    public boolean wordPattern(String pattern, String s) {

        HashMap<Character, String> hm = new HashMap<>();
        String[] a = s.split(" ");    // create array containing each word of s

        for (int i = 0; i < pattern.length(); i++) {

            char original = pattern.charAt(i);
            String replacement = a[i];

            if (pattern.length() != a.length) return false;

            if (!hm.containsKey(original) && !hm.containsValue(replacement)) {
                hm.put(original, replacement);
            }
            else if (hm.containsKey(original)) {
                String duplicate_element = hm.get(original);
                if (!Objects.equals(duplicate_element, replacement)) {
                    return false;
                }
            }
            else{
                return false;
            }
        }
        return true;
    }

}



