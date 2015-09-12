public class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--){
            if (digits[i] == 9){
                digits[i] = 0;
            }else{
                digits[i]++;
                return digits;
            }
        }
        
         int[] newDigi = new int[digits.length + 1];
         newDigi[0] = 1;
         for (int i = 1; i < newDigi.length; i++){
            newDigi[i] = 0;
         }
         return newDigi;
    }
}