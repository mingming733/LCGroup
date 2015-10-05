
public class LongestCommonPrefix {
	
	public String longestCommonPrefixF(String[] strs) {
        String res = "";
        if (strs == null || strs.length == 0) return res;
        if (strs.length == 1) return strs[0];
        for (int i=0; i<strs[0].length(); i++) {
            for (int j = 1; j<strs.length; j++) {
                if (strs[j].length() == i) return res;  
                if (strs[0].charAt(i) != strs[j].charAt(i)) return res; 
            }
            res += strs[0].charAt(i);
        }
        return res;
    }
}
