import java.util.LinkedList;


public class validParentheses {
	
	public static void main(String[] args) {
		String testString = "{}[]()";
		System.out.println(isValid(testString) + "");
		
		testString = "{}[]([])";
		System.out.println(isValid(testString) + "");
		
		testString = "{}[]([]";
		System.out.println(isValid(testString) + "");
		
		testString = "{}[][(])";
		System.out.println(isValid(testString) + "");
		
	}

	
	public static boolean isValid(String s) {
	    if(s==null || s.length()==0)
	        return true;
	    LinkedList<Character> stack = new LinkedList<Character>();
	    for(int i=0;i<s.length();i++)
	    {
	        switch(s.charAt(i))
	        {
	            case '(':
	            case '{':
	            case '[':
	                stack.push(s.charAt(i));
	                break;
	            case ')':
	                if(stack.isEmpty() || stack.pop()!='(')
	                    return false;
	                break;
	            case '}':
	                if(stack.isEmpty() || stack.pop()!='{')
	                    return false;
	                break;
	            case ']':
	                if(stack.isEmpty() || stack.pop()!='[')
	                    return false;
	                break; 
	            default:
	                break;
	        }
	    }
	    if(stack.isEmpty())
	        return true;
	    return false;
	}

}
