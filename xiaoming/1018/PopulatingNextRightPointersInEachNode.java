import java.util.LinkedList;
import java.util.Queue;


public class PopulatingNextRightPointersInEachNode {
	
	public void connect(TreeLinkNode root) {
        if (root == null) return;
        TreeLinkNode next = null;
        Queue<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
        queue.offer(root);
        int reset = 1;
        int power = 1;
        while(!queue.isEmpty()) {
            root = queue.poll();
            root.next = next;
            next = root;
            if (root.right != null) queue.offer(root.right);
            if (root.left != null) queue.offer(root.left);
            reset++;
            if (reset == Math.pow(2, power)) {
                next = null;
                power++;
            }
        }
        
        
    }

}

class TreeLinkNode {
	     int val;
	      TreeLinkNode left, right, next;
	      TreeLinkNode(int x) { val = x; }
	  }
