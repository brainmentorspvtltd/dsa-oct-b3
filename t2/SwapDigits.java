public class SwapDigits {
    public static void main(String[] args) {
        int num = 73456;

        int fd = num%10; // 4
        num = num/10; // 123
        int count = 0;
        int copy = num; // 123
        while(copy>0){
            copy = copy/10;
            count++;
        }

        // count - 3
        int divisor = (int)Math.pow(10, count-1);

        int mid = num%divisor; // 23
        int ld = num/divisor; // 1
        //int fd = num%10; // 4
        // output -> 4 23 1
        // (400 + 23)*10 + 1

        System.out.println(((fd*divisor)+mid)*10+ld);

    }
}
