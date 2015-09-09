import java.util.*;
class Interval{
	int start;
	int end;
	Interval (){
		start = 0;
		end = 0;
	}
	Interval (int s, int e ){
		start = s;
		end = e;
	}
}
public class MergeInterval {
	public List<Interval> merge(List<Interval> intervals) {
        // write your code here
        
        if (intervals == null || intervals.size() <= 1) {
            return intervals;
        }
        
        Collections.sort(intervals, new IntervalComparator());       
  
        ArrayList<Interval> result = new ArrayList<Interval>();
        Interval previous = intervals.get(0);
        for (int i = 1; i < intervals.size(); i++) {
            Interval curt = intervals.get(i);
            if (curt.start <= previous.end ){
                previous.end = Math.max(previous.end, curt.end);
            }else{
                result.add(previous);
                previous = curt;
            }
        }
        
        result.add(previous);
        return result;
    }
     private class IntervalComparator implements Comparator<Interval> {
        public int compare(Interval a, Interval b) {
            return a.start - b.start;
        }
    }

}
