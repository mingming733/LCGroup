/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        if (intervals.size() < 2){
            return intervals;
        }
        Collections.sort(intervals, new Comparator<Interval>(){
            public int compare(Interval a, Interval b){
                return a.start - b.start;
            }
        });
        for (int i = 0; i < intervals.size() - 1; i++){
            if (intervals.get(i).end < intervals.get(i + 1).start){
                continue;
            }else{
                intervals.get(i).end = Math.max(intervals.get(i).end, intervals.get(i + 1).end);
                intervals.remove(i + 1);
                i--;
            }
        }
        return intervals;
    }
}