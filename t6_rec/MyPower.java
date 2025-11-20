public class MyPower {
    static int pow(int num, int pow, int r){
        // base case
        if(pow == 0){
            // System.out.println(r);
            return r;
        }

        return pow(num, pow-1, r*num); // 2, 0, 8
    }

    public static void main(String[] args) {
        int r = pow(2, 5, 1);
        System.out.println(r);
    }
}
