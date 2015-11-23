public class Solution {
    public int hIndex(int[] citations) {
         if(citations== null ||citations.length==0){
            return 0;
        }
        int count=0;
        for(int i= citations.length-1;i>=0;i--){
            if(count<citations[i]){
               count++;
            }
        }
        return count;
    }
}
