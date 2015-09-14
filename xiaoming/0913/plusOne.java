
public class plusOne {
	public int[] plusOneTest (int[] digits){
		int carry = 1;
		for (int i = digits.length -1; i >= 0 && carry == 1; i --){
			if (digits[i] == 9) {
                digits[i] = 0;
            }
			else {
                digits[i]++;
                carry = 0;
            }
		}
		if (carry == 0){
			return digits;
		}
		int[] rst = new int [digits.length + 1]; 
		rst[0] = 1;
		for (int i = 1; i < rst.length; i++ ) {
			rst[i] = digits [i -1];
		}
		return rst;		
	}
}
