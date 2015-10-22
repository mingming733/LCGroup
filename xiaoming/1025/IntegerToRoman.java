// I V  X
// X L  C
// C D  M
public class IntegerToRoman {
	public String intToRoman(int num) {
        if (num < 1 || num > 3999) return "";
        StringBuilder str = new StringBuilder();
        int temp = num/ 1000;
        while (temp > 0) {
            str.append("M");
            temp--;
        }
        
        num %= 1000;
        temp = num/100;
        if (temp <= 3) {
            while (temp > 0) {
                str.append("C");
                temp--;
            }
        }
        else if (temp == 4) str.append("CD");
        else if (temp < 9) {
            str.append("D");
            while (temp > 5) {
                str.append("C");
                temp--;
            }
        }
        else str.append("CM");
        
        num %= 100;
        temp = num/10;
        if (temp <= 3) {
            while (temp > 0) {
                str.append("X");
                temp--;
            }
        }
        else if (temp == 4) str.append("XL");
        else if (temp < 9) {
            str.append("L");
            while (temp > 5) {
                str.append("X");
                temp--;
            }
        }
        else str.append("XC");
        
        num %= 10;
        temp = num;
        if (temp <= 3) {
            while (temp > 0) {
                str.append("I");
                temp--;
            }
        }
        else if (temp == 4) str.append("IV");
        else if (temp < 9) {
            str.append("V");
            while (temp > 5) {
                str.append("I");
                temp--;
            }
        }
        else str.append("IX");
        
        return str.toString();

    }
}
