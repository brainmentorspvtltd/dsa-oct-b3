
public class Doubt_1 {
    public static void main(String[] args) {
        stringDemo();
        stringBuilderDemo();
    }

    public static void stringBuilderDemo() {
        long time1 = System.currentTimeMillis();
        StringBuilder name = new StringBuilder("d");
        int count = 0;
        while (count < 1000) {
            name = name.append(count);
            count++;
        }
        long time2 = System.currentTimeMillis();

        System.out.println("time taken: " + (time2 - time1));

    }

    public static void stringDemo() {
        long time1 = System.currentTimeMillis();
        String name = "d";
        int count = 0;
        while (count < 1000) {
            name = name + count;
            count++;
        }
        long time2 = System.currentTimeMillis();

        System.out.println("time taken: " + (time2 - time1));

    }
}
