
public class CountAndSay {
	
	public String countAndSay(int n) {
	    if( n <= 0 )	return "";
	    
	    String curRes = "" + n;
        StringBuilder res = new StringBuilder();
        int count = 1;

	    for( int i = 1; i < curRes.length(); i++)
	    {
	    	
	    	if(curRes.charAt(i) == curRes.charAt(i-1))
	    	{
                count++;
	    	}
            else
            {
                res.append(count);
                res.append(curRes.charAt(i-1));
                count = 1;
            }
	    }
	    
        res.append(count);
        res.append(curRes.charAt(curRes.length()-1));
        
        curRes = res.toString();
	    return curRes;
	}

}
