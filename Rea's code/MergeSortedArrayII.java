import java.util.*;
public class MergeSortedArrayII {
	public ArrayList<Integer> mergeSortedArray(ArrayList<Integer> A, ArrayList<Integer> B) {
        int length = B. size ();
        for (int i = 0; i < length; i ++){
            A.add (B.get(i));
            
        }
        Collections. sort (A);
        return A;
    }
}
