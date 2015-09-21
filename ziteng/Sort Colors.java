public class Solution {
    public void sortColors(int[] A) {
        int count0=0,count1=0,count2=0;
        int length = A.length;
        //if (length==0|length==1) return;
        for(int i = 0; i < length;i++){
            switch(A[i]){
                case 0: count0++;break;
                case 1: count1++;break;
                case 2: count2++;break;
            }
        }
        for(int i = 0; i < length; i++){
            if(i < count0){
                A[i]=0;
            }
            else if(i >= count0+count1){
                A[i]=2;
            }
            else A[i]=1;
        }
        //return A;
    }
}
