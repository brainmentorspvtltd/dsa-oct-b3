import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

public class L987_VerticalOrder {
    
}

class Pair{
    int row;
    int value;
    Pair(int row, int value){
        this.row = row;
        this.value = value;
    }
}
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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) return list;

        // key => col
        TreeMap<Integer, List<Pair>> map = new TreeMap<>();
        helper(root, 0, 0, map);

        for(int col: map.keySet()){
            List<Pair> pairs = map.get(col);

            Collections.sort(pairs, new Comparator<Pair>(){
                public int compare(Pair p1, Pair p2){
                    if(p1.row == p2.row){
                        return p1.value - p2.value;
                    }
                    return p1.row - p2.row;
                }
            });
            List<Integer> sl = new ArrayList<>();
            for(Pair p: pairs){
                sl.add(p.value);
            }
            list.add(sl);
        }
        return list;
    }

    public void helper(TreeNode root, int row, int col, TreeMap<Integer, List<Pair>> map){
        if(root == null) return;

        if(map.get(col)==null){
            map.put(col, new ArrayList<Pair>());
        }

        map.get(col).add(new Pair(row, root.val));

        helper(root.left, row+1, col-1, map);
        helper(root.right, row+1, col+1, map);
        
    }
}