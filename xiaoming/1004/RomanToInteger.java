import java.util.HashMap;


public class RomanToInteger {
	
	public int romanToInt(String s) {
		if(s == null || s.length() == 0) 	return 0;
		HashMap<Character,Integer> charValues = new HashMap<Character, Integer>();
		
		charValues.put('I',1);
		charValues.put('V',5);
		charValues.put('X',10);
		charValues.put('L',50);
		charValues.put('C',100);
		charValues.put('D',500);
		charValues.put('M',1000);
		charValues.put('i',1);
		charValues.put('v',5);
		charValues.put('x',10);
		charValues.put('l',50);
		charValues.put('c',100);
		charValues.put('d',500);
		charValues.put('m',1000);
	
		int res = 0;
		int pre = 0;
		int cur = 0;
		
		for (int i = 0; i < s.length(); i++) {
			cur = charValues.get(s.charAt(i));
			res += cur;
			
			if ( cur % 5 == 0 ) {
				if (i-1 >= 0) {
					pre = charValues.get(s.charAt(i - 1));
					if(pre * 5 == cur || pre * 10 == cur) {
					res = res - pre * 2;
					}
				}
			}
		}
		return res;
    }
}
