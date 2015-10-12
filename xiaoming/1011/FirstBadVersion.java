
public class FirstBadVersion {
	
	public int firstBadVersionF(int n) {
        if (n < 1) return 0;
        
        int start = 1;
        int end = n;
        if (!isBadVersion(n)) return 0;

        while (start <= end) {
            int mid = (start + end ) / 2;
            if (isBadVersion(mid)) end = mid -1;
            else start = mid + 1;
        }
        return start;
    }

}
