public class BinaryToDecimal {
    static int count = 0;
    static int convert(int num){
        if(num==0){
            return 0;
        }
        // 1*2^0 - 1
        int n = (int)(num%10 * Math.pow(2, count));
        count++;
        return n + convert(num/10);
    }
    public static void main(String[] args) {
        int d = convert(1010);
        System.out.println(d);
    }
}






