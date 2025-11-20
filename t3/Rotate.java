public class Rotate {
    public static void main(String[] args) {
        int num = 12345;
        int copy = num;
        int rotate = 3;
        int count = 0;
        // output => 34512

        while (copy > 0) {
            count++;
            copy = copy / 10;
        }

        for (int i = 0; i < rotate; i++) {
            int ld = num % 10; // 5
            num = num / 10; // 1234
            num = num + ld * (int) Math.pow(10, count - 1); // 50000 + 1234 = 51234

            System.out.println(num);
        }
    }
}
