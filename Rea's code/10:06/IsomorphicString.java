import java.util.HashMap;




public class IsomorphicString {
	public boolean isIsomorphic(String s, String t) {
        char[] t1 = s.toCharArray();
        char[] t2 = t.toCharArray();
        HashMap<Character, Character> map = new HashMap<Character,Character>();

        for(int i=0;i<t1.length;i++){
        	if(map.containsKey(t1[i])){ //when t1[i] already has map
        		char temp = map.get(t1[i]);
        		if(temp == t2[i])
        			t1[i] = temp;
        		else return false;
        	}else if(map.containsValue(t2[i])){ //make sure there no other values map to t2[i]
        		return false;
        	}else
        		map.put(t1[i], t2[i]);
        }
        return true;
    }
}
