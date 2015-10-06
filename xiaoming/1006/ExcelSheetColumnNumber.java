
public class ExcelSheetColumnNumber {
	public int titleToNumber(String s){
		if (s == null || s.length() == 0) return -1;
		s.toUpperCase();
		int res = 0;
		for (int i = 0; i < s.length() ; i++) {
			res += Math.pow(26, i) * ( s.charAt(s.length() - i -1) - 'A' + 1 );
		}
		return res;
	}
}
