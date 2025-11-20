public class CountDigit {
    static int count(int num, int count){
        if(num==0){
            // System.out.println(count);
            return count;
        }

        return count(num/10, count+1); // 0, 3
    }
    public static void main(String[] args) {
        int c = count(53, 0);
        System.out.println(c);
    }
}
