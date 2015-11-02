public class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> rst =new ArrayList<String>();
        List<String> list= new ArrayList<String>();
        if(s.length()<4 || s.length()>12){
            return rst;
        }
       
        helper(rst,list,s,0);
        return rst;
    }
    public void helper(List<String> rst, List<String> list, String s, int start){
        if(list.size()==4){
            if(start!=s.length())
            return;
            
            StringBuffer sb=new StringBuffer();
            for(String tmp:list){
                sb.append(tmp);
                sb.append(".");
            }
            sb.deleteCharAt(sb.length()-1);
            rst.add(sb.toString());
            return;
        }
        for(int i=start;i<s.length() && i<=start+3;i++){
            String tmp=s.substring(start,i+1);
            if(isvalid(tmp)){
                list.add(tmp);
                helper(rst,list,s,i+1);
                list.remove(list.size()-1);
            }
        }
        
    }
    private boolean isvalid(String s){
        if(s.charAt(0)=='0')
        return s.equals("0");
        int digit=Integer.valueOf(s);
        return digit>=0 && digit<=255;
    }
}
