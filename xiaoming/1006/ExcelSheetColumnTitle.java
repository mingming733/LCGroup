
public class ExcelSheetColumnTitle {
	
	public String convertToTitle(int n){
		String res = "";
		if (n <= 0) return res;
		while (n != 0) {
			int digit = n % 26;
			n /= 26;
			char temp = (char) ('A' + digit - 1);
			res = temp + res;
		}
		
		return res;
	}
}
