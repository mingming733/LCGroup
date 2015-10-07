
public class AddDigits {

    public int addDigits(int num) {   	
    	if (num < 0)  return -1;  	
    	while ( num >= 10 ) { 		
    		int sum = 0;
    		while (num != 0) {
    			int digit = num % 10;
    			num /= 10;
    			sum += digit;
    		}
    		num = sum;
    	}
    return num;    
    }
}
