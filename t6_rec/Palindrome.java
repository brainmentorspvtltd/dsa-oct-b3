public class Palindrome {
    static void findPalindrome(int original, int num, int rev){
        System.out.println("Original: "+original+", Num: "+num+", Rev: "+rev);

        if(num==0){
            if(original==rev){
                System.out.println("Palindrome");
            } else {
                System.out.println("Not Palindrome");
            }
            return;
        }
        findPalindrome(original, num/10, (rev*10)+num%10);
    }

    public static void main(String[] args) {
        int num = 423;
        findPalindrome(num, num, 0);
    }
}
