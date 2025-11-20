public class Rotate2 {
    public static void main(String[] args) {
        int num = 12345;
        int rotate = 16; // 1000
        int count = 0;
        int copy = num;
        while (copy > 0) {
            copy = copy / 10;
            count++;
        }
        // count - 5

        rotate = rotate % count;

        if (rotate == 0) {
            System.out.println(num);
        } else {
            System.out.println("Calculation..."+rotate);

            int divisor = (int) Math.pow(10, rotate); // 1000
            int part2 = num % divisor; // 345
            int part1 = num / divisor; // 12

            // System.out.println(part1);
            // System.out.println(part2); // 345

            part2 = part2 * (int) Math.pow(10, count - rotate);
            System.out.println(part2 + part1);
        }
    }
}
