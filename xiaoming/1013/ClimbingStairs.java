
public class ClimbingStairs {
	public int climbStairs(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        int a1 = 1;
        int a2 = 2;
        int temp = 0;
        for (int i=3; i<=n; i++) {
            temp = a2;
            a2 = a1 + a2;
            a1 = temp;
        }
        return a2;
    }
}
