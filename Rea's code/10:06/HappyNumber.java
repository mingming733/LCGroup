import java.util.HashSet;


public class HappyNumber {
	public boolean isHappy(int n) {
        HashSet<Integer> s = new HashSet<Integer>();  
        while(n != 1) {  
            int sum = 0;  
            while(n != 0) {  
                int mod = n % 10;  
                sum += mod * mod;  
                n /= 10;  
            }  
            if(s.contains(sum))  
                return false;  
            s.add(n = sum);  
        }  
        return true;  
    }
}
