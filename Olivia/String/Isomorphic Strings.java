public class Solution {
    public boolean isIsomorphic(String s, String t) {
       int m1[256]={0}, m2[256]={0}, n=s.size(); 
       for(int i =0;i<n;i++){
           if(m1[s[i]]!=m2[t[i]]){
               return false;
           }
           m1[s[i]]=i+1;
           m2[t[i]]=i+1;
       }
       return true;
    }
}
// 由于ASCII码只有256个字符，所以我们可以用一个256大小的数组来代替哈希表，
//并初始化为0，我们遍历原字符串，分别从源字符串和目标字符串取出一个字符，
//然后分别在两个哈希表中查找其值，若不相等，则返回false，若想等，将其值更新为i + 1
