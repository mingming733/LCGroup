import java.util.*;


public class BinaryTreePaths {
	
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
		
		List<String> rst = binaryTreePath(root);
		while (rst.size() != 0 && rst != null) {
		System.out.println(rst.remove(0));
		}
		
	}
	
	
	public static List<String> binaryTreePath(TreeNode root) {	
		List<String> paths = new LinkedList<String>();
		String onePath = "->";
		if (root == null) return paths;
		onePath += root.val;
		
		if (root.left == null && root.right  == null) {
			paths.add(onePath);
			return paths;
		}
		paths = binaryTreePath(root.left);
		paths.addAll(binaryTreePath(root.right));
		int n = paths.size();
		for (int i = 0; i < n; i++) {
			paths.add( onePath + paths.remove(0));
		}

		return paths;	
		
		
//		if (root == null)  {
//			return null;
//		}
//        
//		onePath += root.val;
//		
//		if (root.left == null && root.right  == null) {
//			paths.add(onePath);
//			return paths;
//
//		}
//		
//		if (root.left != null && root.right == null) {
//			paths = binaryTreePath(root.left);
//			int n = paths.size();
//			for (int i = 0; i < n; i++) {
//				paths.add( onePath + paths.remove(0));
//			}
//			return paths;
//		}
//		
//		if (root.left == null && root.right != null) {
//			paths = binaryTreePath(root.right);
//			int n = paths.size();
//			for (int i = 0; i < n; i++) {
//				paths.add( onePath + paths.remove(0));
//			}
//			return paths;
//		}
//		
//		paths = binaryTreePath(root.left);
//		paths.addAll(binaryTreePath(root.right));
//		int n = paths.size();
//		for (int i = 0; i < n; i++) {
//			paths.add( onePath + paths.remove(0));
//		}
//
//		return paths;
    }

}
