public class Solution {
    public int titleToNumber(String s) {
        int rst=0;
        if(s==null ||s.length()==0){
            return 0;
        }
        for(int i=0;i<s.length();i++){
        rst=rst*26+((s.charAt(i)-'A')+1);
        }
        return rst;
    }
}
