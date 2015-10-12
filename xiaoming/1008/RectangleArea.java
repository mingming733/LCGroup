
public class RectangleArea {
	public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        if (A>C || B>D || E>G || F>H) return 0;
        int area = (C-A)*(D-B) + (G-E)*(H-F);
        if (B >= H || F>=D || E>=C || A>=G) 
            return area;
        else return area - (Math.min(C,G) - Math.max(A,E)) * (Math.min(D,H) - Math.max(B,F));
    }
}
