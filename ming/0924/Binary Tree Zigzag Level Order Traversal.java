public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
        
        ArrayList<ArrayList<Integer>> result = new ArrayList();
        if (root == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        boolean normalOrder = true;
        while(!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> line = new ArrayList<Integer>();
            for (int i = 0; i < size; i++){
                TreeNode head = queue.poll();
                if (head.left != null){
                    queue.offer(head.left);
                }
                if (head.right != null){
                    queue.offer(head.right);
                }
                if (normalOrder){
                    line.add(head.val); 
                }else{
                    line.add(0, head.val);
                }
            }
            result.add(line);
            normalOrder = !normalOrder;
        }
        return result;
    }