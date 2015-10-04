public class Solution {
    public String addBinary(String a, String b) {
        if(a.length()<b.length()){
            String tmp=a;
            a=b;
            b=tmp;
        }
        int al=a.length()-1,bl=b.length()-1,carry=0;
        String rst="";
        while(bl>=0){
            int sum=(int)(a.charAt(al)-'0')+(int)(b.charAt(bl)-'0')+carry;
            rst=String.valueOf(sum%2)+rst;
            carry=sum/2;
            al--;
            bl--;
        }
        while(al>=0){
            int sum=(int)(a.charAt(al)-'0')+carry;
            rst=String.valueOf(sum%2)+rst;
            carry=sum/2;
            al--;
        }
        if(carry==1){
            rst='1'+rst;
        }
        return rst;
        
    }
}
