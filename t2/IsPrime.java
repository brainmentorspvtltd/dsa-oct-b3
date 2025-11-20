public class IsPrime {
    public static void main(String[] args) {
        int num = 97;
        boolean isPrime = true;
        for(int i=2;i*i<num;i++){
            if(num%i==0){
                System.out.println("Not prime because divisible by "+i);
                isPrime = false;
                break;
            } 
            System.out.println(i);
        }
        if(isPrime){
            System.out.println(num + "is prime");
        } else {
            System.out.println(num + "is not prime");
        }
    }
}
