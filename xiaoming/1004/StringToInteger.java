
public class StringToInteger {
	
	public int myAtoi(String str) {
        if( str == null )  return 0;  
	    str = str.trim();  
	    if( str.length() == 0 )  return 0;  
	    
	    int res = 0;  
	    for(int i=0; i<str.length(); i++)  
	    {  
	        if(str.charAt(i) < '0' || str.charAt(i) > '9')  
	            break;  
	        int digit = (int)( str.charAt(i) - '0' );  
	        if(str.charAt(0) == '-' && res > 0 - ((Integer.MIN_VALUE + digit)/10))  
	            return Integer.MIN_VALUE;  
	        else if(str.charAt(0) != '-' && res > (Integer.MAX_VALUE - digit)/10)  
	            return Integer.MAX_VALUE;  
	        res = res*10 + digit;  
	    } 
        if(str.charAt(0) == '-')  return 0 - res;
	    return res;  
	}
}
