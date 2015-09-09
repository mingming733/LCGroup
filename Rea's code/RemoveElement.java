
public class RemoveElement {
	public int removeElement(int[] A, int elem) {
        // write your code here
        int i, j = 0;
        if (A.length == 0 || A == null){
            
            return 0;
        }
        else{
            
            for (i = 0; i < A.length; i ++){
                if (A [i] != elem){
                    A [j] = A [i];
                    j ++;
                }
            }
                
            
            return j;
        }
    }
}
