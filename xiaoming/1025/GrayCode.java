import java.util.LinkedList;
import java.util.List;


public class GrayCode {
	public List<Integer> grayCodeF(int n) {
        
        List<Integer> list = new LinkedList<Integer>();
        if (n < 1) {
            list.add(0);
            return list;
        }
        list.add(0);
        list.add(1);
        int power = 1;
        int base = 0;
        int symmetry = 0;
        for (int i = 2; i < Math.pow(2, n); i++) {
            if (i == (int)Math.pow(2, power)) {
                base = (int)Math.pow(2, power);
                symmetry = i;
                power++;
                list.add( base + list.get(i - 1));
            }
            else {
                list.add( base + list.get(2 * symmetry - i - 1));
            }
        }
        return list;
    }
}
