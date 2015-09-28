import java.util.*;

//  invertT(root);
//  invertT(TreeNode root) { 
//		if (root == null) return;
//		TreeNode temp = root.left;
//		root.left = root.right;
//		root.right = temp;
//		invertT(root.left);
//		invertT(root.right);
//	}



public class InvertBinaryTree {
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(20);
		TreeNode root1 = new TreeNode(30);
		TreeNode root2 = new TreeNode(40);
		root.left = root1;
		root.right = root2;
		root1.left = new TreeNode(100);
		
		root1.right = new TreeNode(200);
		
		root1.left.right = new TreeNode(500);

		root2.right = new TreeNode(50);
		
		
		List<TreeNode> rstF = new LinkedList<TreeNode>();
		rstF.add(root);
		while (rstF.size() != 0) {
			TreeNode removed = rstF.remove(0);
			System.out.print(removed.val + " ");
			if (removed.left != null) rstF.add(removed.left);
			if (removed.right != null) rstF.add(removed.right);
		}
		
		System.out.println();
				
		root = invertTree(root);
		List<TreeNode> rst = new LinkedList<TreeNode>();
		rst.add(root);
		while (rst.size() != 0) {
			TreeNode removed = rst.remove(0);
			System.out.print(removed.val + " ");
			if (removed.left != null) rst.add(removed.left);
			if (removed.right != null) rst.add(removed.right);
		}
	}

	
	
//	public static TreeNode invertTree(TreeNode root) { 
//		if (root == null) return root;
//		TreeNode temp = root.left;
//		root.left = root.right;
//		root.right = temp;
//		invertTree(root.left);
//		invertTree(root.right);
//		return root;
//	}
//	
	
	
	
	
	
	
	
	public static TreeNode invertTree(TreeNode root) {
        if (root == null) return root;
        exchange(root.left, root.right);
        return root;
    }
    
    static void exchange (TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null)  return;
        else if (root1 == null) { 
        	root1 = root2; 
        	root2 = null;
        	exchange(root1.left, root1.right);
        	return; }
        else if (root2 == null) { 
        	root2 = root1; 
        	root1 = null;
        	exchange(root2.left, root2.right);
        	return;}
        else {
        TreeNode temp = root1;
        root1 = root2;
        root2 = temp;
        exchange(root1.left, root1.right);
        exchange(root2.left, root2.right);
        }
    }
	
	
	
}


class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) 
    {
        this.val = val;
        left = null;
        right = null;
    }
}