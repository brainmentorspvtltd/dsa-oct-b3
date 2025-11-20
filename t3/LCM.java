public class LCM {
    public static void main(String[] args) {
        int n = 4;
        int m = 6;
        int lcm = 0;

        for(int i=1;i<10;i++){
            if((m * i) % n == 0){
                lcm = m * i;
                break;
            }
        }

        System.out.println("LCM of "+n+" and "+m+" is "+lcm);
    }
}
