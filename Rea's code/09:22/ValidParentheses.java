import java.util.Stack;


public class ValidParentheses {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "{)}]{([]";
		
		System.out.print(isValidParentheses (str));
		
	}
	public static boolean isValidParentheses(String s){
		if (s == null || s.length() == 1){
			return false;
		}
		Stack <Character> a = new Stack <Character>();
		for (int i = 0; i < s.length(); i ++){
			if ((s.charAt(i) == '(') || (s.charAt (i) == '{' ) || (s.charAt(i) == '[')){
				a.push(s.charAt(i));
			}
			else {
				if (a.size() == 0){
					return false;
				}
				char top = a.pop();
				if (s.charAt(i) == '}'){
					if (top != '{'){
						return false;
					}
				}
				if (s.charAt(i) == ']'){
					if (top != '['){
						return false;
					}
				}
				if (s.charAt(i) == ')'){
					if (top != '('){
						return false;
					}
				}
				
			}
		}
		return a.size() == 0;
	}
}
