public class findMinDifference {
     public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
         TreeNode(int x) { val = x; }
      }

    TreeNode prev;
    int minDiff = Integer.MAX_VALUE;

    public void inOrderTraverse(TreeNode focusNode){
        if(focusNode != null){
            inOrderTraverse(focusNode.left);

            if(prev != null && focusNode.val - prev.val < minDiff){
                minDiff = focusNode.val - prev.val;
            }

            prev = focusNode;

            inOrderTraverse(focusNode.right);
        }
    }


    public int getMinimumDifference(TreeNode root) {
        inOrderTraverse(root);
        return minDiff;
    }
}
