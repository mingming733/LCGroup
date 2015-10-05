import java.util.Arrays;


public class ValidAnagram {
	public boolean isAnagram(String s, String t) {
        if (null == s && null == t) {
        return true;
    }
    if (null == s || null == t || s.length() != t.length()) {
        return false;
    }
    char[] chars = s.toCharArray();
    Arrays.sort(chars);
    s = String.valueOf(chars);
 
    char[] chart = t.toCharArray();
    Arrays.sort(chart);
    t = String.valueOf(chart);
 
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) != t.charAt(i)) {
            return false;
        }
    }
    return true;
    }
}
