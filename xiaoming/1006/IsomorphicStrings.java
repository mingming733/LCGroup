import java.util.HashMap;

public class IsomorphicStrings {

	public boolean isIsomorphic(String s, String t) {

		if (s == null || t == null || s.length() != t.length())
			return false;
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				if (map.get(s.charAt(i)) != t.charAt(i))
					return false;
			}
			else {
				if (!map.containsValue(t.charAt(i)))
					map.put(s.charAt(i), t.charAt(i));
				else
					return false;
			}
		}
		return true;
	}
}
