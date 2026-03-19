public class L20 {
    
}
class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                // open
                stack.push(c);
            } else {
                // close
                if(stack.isEmpty()){
                    return false;
                } else {
                    if(
                        (c==')' && stack.peek()=='(') ||
                        (c=='}' && stack.peek()=='{') ||
                        (c==']' && stack.peek()=='[') 
                    ) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}