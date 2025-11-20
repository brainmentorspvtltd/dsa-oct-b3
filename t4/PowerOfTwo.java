public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 312;
        int copy = n;

        while(n>1){
            if(n%2==0){
                n = n/2; // 0
            } else {
                System.out.println("Not power of 2");
                return;
                // break;
            }
        }
        System.out.println(copy+" is power of 2");
    }
}
