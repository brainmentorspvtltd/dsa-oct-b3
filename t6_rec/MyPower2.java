public class MyPower2 {
    static int pow(int num, int pow){
        // base case
        if(pow == 0){
            return 1;
        }
        int p = pow(num, pow-1);
        return num * p;
    }

    public static void main(String[] args) {
        int r = pow(2, 5);
        System.out.println(r);
    }
}
