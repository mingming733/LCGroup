
public class AddBinary {

	public String addBinaryStr(String a, String b) {
	    if(a==null || a.length()==0)
	        return b;
	    if(b==null || b.length()==0)
	        return a;
	    int i=a.length()-1;
	    int j=b.length()-1;
	    int carry = 0;
	    int digit = 0;
	    String result = "";
	    String temp = "";
	    while(i>=0&&j>=0)
	    {
	        digit = (int)(a.charAt(i)) + (int)(b.charAt(j)) + carry;
	        carry = digit/2;
	        digit %= 2;
	        temp += digit;
	        i--;
	        j--;
	    }
	    while(i>=0)
	    {
	        digit = (int)(a.charAt(i)) + carry;
	        carry = digit/2;
	        digit %= 2;
	        temp += digit;
	        i--;
	    }
	    while(j>=0)
	    {
	        digit = (int)(b.charAt(j)) + carry;
	        carry = digit/2;
	        digit %= 2;
	        temp += digit;
	        j--;
	    }      
	    if(carry>0)
	    {
	    	temp += carry;
	    }
	    for (int k = 0; k < result.length(); k++) {
	    	result += result.charAt(result.length() - k -1);
	    }
	    
	    return result;	
	}
}


// StringBuilder result = new StringBuilder();
// result.append(digit);
// return result.reverse().toString();
