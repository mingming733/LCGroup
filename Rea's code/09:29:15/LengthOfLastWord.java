
public class LengthOfLastWord {
	public int lenghtOfLastWord (String s){
		if (s == null || s.length() == 0){
			return 0;
		}
		boolean flag = false;
		int result = 0;
		int len = s.length();
		for (int i = s.length() -1; i >= 0; i --){
			char c = s.charAt(i);
			if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
				flag = true;
				result ++;
			}
			else {
				if (flag){
					return result;
				}
			}
		}
		return result;
	}
}
