public class Solution {
    public int addDigits(int num) {
        int rst=0;
        while(num>9){
            rst=rst+num%10;
            num=num/10;
        }
        rst=rst+num;
        while(rst>9){
            rst=rst%10+rst/10;
        }
        return rst;
    }
}
