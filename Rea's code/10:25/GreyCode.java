import java.util.*;
public class GreyCode {
	public ArrayList<Integer> grayCode(int n) {
        if(n==0) {  
            ArrayList<Integer> result = new ArrayList<Integer>();  
            result.add(0);  
            return result;  
        }  
          
        ArrayList<Integer> result = grayCode(n-1);  
        int addNumber = 1 << (n-1);
        int originalsize=result.size();
        
        for(int i=originalsize-1;i>=0;i--) {  
            result.add(addNumber + result.get(i));  
        }  
        return result;  
 
    }
}
