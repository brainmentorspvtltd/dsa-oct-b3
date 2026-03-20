import java.util.ArrayList;
import java.util.Stack;

public class GFG_NextGreaterElement {
    
}
// https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1
class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here // [6, 8, 0, 1, 3, 1] // result -> -1,-1
        ArrayList<Integer> result = new ArrayList<>();
        int[] ans = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        
        for(int i=arr.length-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<=arr[i]){
                stack.pop();
            }
            
            if(stack.isEmpty()){
                ans[i] = -1;
            } else{
                ans[i] = stack.peek();
            }
            
            stack.push(arr[i]);
            
        }
        
        for(int i=0;i<ans.length;i++){
            result.add(ans[i]);
        }
        
        return result;
        
    }
}