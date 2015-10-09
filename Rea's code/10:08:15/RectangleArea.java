
public class RectangleArea {
	public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        long t1 = Math.min(D, H);
        long t2 = Math.max(B, F);
        long a = Math.max(t1 - t2,0);
        t1 = Math.min(C, G);
        t2 = Math.max(A, E);
        long b =  Math.max(t1 - t2,0);
        return  (int) ((D-B)*(C-A) + (H-F)*(G-E) - a*b);
}
}
