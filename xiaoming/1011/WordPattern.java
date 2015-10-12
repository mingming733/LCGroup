import java.util.HashMap;


public class WordPattern {
	public boolean wordPatternF(String pattern, String str) {
        
        String[] arr = str.split(" ");
        HashMap<Character, String> map = new HashMap<Character, String>();
        if(arr.length!= pattern.length())
            return false;
        for(int i = 0; i < pattern.length(); i++){
            if(map.containsKey(pattern.charAt(i))){
                if(!map.get(pattern.charAt(i)).equals(arr[i]))
                    return false;
            }else{
                if(map.containsValue(arr[i]))
                    return false;
                map.put(pattern.charAt(i), arr[i]);
            }    
        }
        return true;
        
    }

}
