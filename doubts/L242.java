import java.util.Arrays;

public class L242 {
    
}
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] fa = new int[26];
        int[] sa = new int[26];

        for(int i=0;i<s.length();i++){
            fa[s.charAt(i) - 'a']++;
        }
        for(int i=0;i<t.length();i++){
            sa[t.charAt(i) - 'a']++;
        }
        
        return Arrays.equals(fa, sa);

    }

}