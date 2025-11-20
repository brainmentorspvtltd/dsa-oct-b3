public class ProductDigit {
    static int product(int n, int m){
        if(n==0 || m==0){
            return 0;
        }
        int num = (n%10) * (m%10);
        return num + product(n/10, m/10);
    }
    public static void main(String[] args) {
        int fn = 36;
        int sn = 4532;

        System.out.println(product(fn, sn)); // 21
    }
}
