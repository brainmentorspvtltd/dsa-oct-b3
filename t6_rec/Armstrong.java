public class Armstrong {
    static int count = 0;
    static int sum = 0;
    static void isArmstrong(int num){ // 0
        // base case
        if(num==0){
            return;
        }
        if(num>0){
            count++;
        }
        isArmstrong(num/10); 
        sum = sum + pow(num%10, count);
    }
        static int pow(int num, int pow){
        // base case
        if(pow == 0){
            return 1;
        }
        int p = pow(num, pow-1);
        return num * p;
    }

    public static void main(String[] args) {
        isArmstrong(153);
    }
}
