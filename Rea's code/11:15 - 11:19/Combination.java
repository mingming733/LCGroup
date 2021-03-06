import java.util.*;
public class Combination {
	public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList <List<Integer>>();
        List<Integer> list = new ArrayList <Integer>();
        helper (res, list, n, k, 1);
        return res;
    }
    public void helper (List<List<Integer>> res, List<Integer> list, int n, int k, int start){
        if (list.size () == k){
            res.add (new ArrayList (list));
            return;
        }
        for (int i = start; i <= n; i ++){
            list.add(i);
            helper (res, list, n, k, i + 1);
            list.remove (list.size()-1);
        }
    } 
}
