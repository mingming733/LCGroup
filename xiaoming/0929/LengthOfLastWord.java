
public class LengthOfLastWord {

	public int lengthOfLastWord(String s) {  
	    if( s==null || s.length()==0)  
	        return 0;  
	    int endIndex = s.length()-1;  
	    while(endIndex >= 0 && s.charAt(endIndex) == ' ') 	endIndex--;  
	    int startIndex = endIndex;  
	    while(startIndex >= 0 && s.charAt(startIndex) != ' ') 	startIndex--;  
	    return endIndex-startIndex;  
	}
}
