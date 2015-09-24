
public class PlusOne {
	//another method can compare if every element are 9 or not, then there are two situation: all 9; not all 9
	public static int[] plusOne (int [] digits){
		int carry = 1;
		for (int i = digits.length -1; i >= 0 && carry > 0; i --){
			int sum = digits [i] + carry;
			digits [i] = sum % 10;
			carry = sum / 10;
		}
		if (carry == 0){
			return digits;
		}
		int [] rst = new int [digits.length + 1]; 
		rst [0] = 1;
		for (int i = 1; i < rst.length; i ++ ){
			
			rst [i] = digits [i -1];
		}
		return rst;
		
	}

	public static void main (String [] args){
		int [] a = {1,9};
		int []array1 = plusOne (a);
		for (int i = 0; i < array1.length; i ++){
			System.out.println(array1[i]);
		}
		
	}

}
