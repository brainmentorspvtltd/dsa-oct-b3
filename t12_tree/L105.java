import java.util.*;

public class L105 {
    
}
 /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

        public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
    int preIndex = 0;
    Map<Integer, Integer> inorderMap = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            inorderMap.put(inorder[i], i);
        }

        return build(preorder, 0, inorder.length-1);

    }

    TreeNode build(int[] preorder, int start, int end){
        if(start > end) return null;

        int rootValue = preorder[preIndex];
        preIndex++;

        TreeNode node = new TreeNode(rootValue);

        if(start == end) return node;

        int rootIndex = inorderMap.get(rootValue);

        // left, 1, right
        node.left = build(preorder, start, rootIndex-1);
        node.right = build(preorder, rootIndex+1, end);

        return node;
    }
}