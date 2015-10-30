import java.util.*;
public class GenerateParentheses {
	public static void main (String[]args){
		int n = 3;
		System.out.print(generateParentheses(n));
	}
	public static List<String> generateParentheses (int n){
		List<String> res = new LinkedList<String>();
		if (n <= 0){
			return null;
		}
		helper (n, n, "", res  );
		return res;
	}
	public static void helper (int l, int r, String str, List<String> res){
		if (l > r){
			return;
		}
		if (l == 0 && r == 0){
			res.add(str);
		}
		if (l > 0) helper (l-1, r, str + "(", res);
		if (r > 0) helper (l, r -1, str + ")", res);
	}
}
