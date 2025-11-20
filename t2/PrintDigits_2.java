public class PrintDigits_2 {
    public static void main(String[] args) {
        int num = 482563;
        int copy = num;
        // find number of digits
        int count = 0;

        while(num>0){
            // num%10 -> ld
            num = num/10;
            count++;
        }
        num = copy;
        // System.out.println(num);
        // System.out.println(count);

        // find divisor
        int divisor = 1;
        for(int i=0;i<count-1;i++){
            divisor = divisor * 10;
        }

        // System.out.println(divisor);

        // last part: print first digit
        while(num>0){
            int fd = num/divisor;
            num = num%divisor; // R
            divisor = divisor/10;
            System.out.println(fd);
        }

    }
}
