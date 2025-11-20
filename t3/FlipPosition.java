public class FlipPosition {
    public static void main(String[] args) {
        int pos = 0;
        int num = 32145;
        // pos -  54321
        // output => 12543
        //.       10000 + 2000 + 500 + 40 + 3
int output = 0;
while(num>0){
        int ld = num%10; // 5
        pos++; // 1
        System.out.println(pos * Math.pow(10, ld-1));
        output = output + (int)(pos * Math.pow(10, ld-1));
        num = num/10; // 3214
}
System.out.println(output);
        
    }
}
