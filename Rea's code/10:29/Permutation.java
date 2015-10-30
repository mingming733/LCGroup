import java.util.*;
public class Permutation {
	public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new LinkedList<List<Integer>>();  
	    if(nums ==null || nums.length==0)  
	        return res;  
	    Arrays.sort(nums);
	    boolean[] used= new boolean[nums.length];
	    for (int i = 0; i < nums.length; i++) used[i] = false;
	    helper(nums, used, new LinkedList<Integer>(), res);  
	    return res;  
	}  
	public void helper(int[] num, boolean[] used, LinkedList<Integer> item, List<List<Integer>> res)  
	{  
	    if(item.size() == num.length)  
	    {  
	        res.add(new LinkedList<Integer>(item));  
	        return;  
	    }  
	    for(int i=0; i<num.length; i++)  
	    {  
	        if(i>0 && !used[i-1] && num[i]==num[i-1]) continue;  
	        if(!used[i])  
	        {  
	            used[i] = true;  
	            item.add(num[i]);  
	            helper(num, used, item, res);  
	            item.remove(item.size()-1);  
	            used[i] = false;  
	        }  
	    }  
    }
}
