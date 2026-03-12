public class PrintStar {
    static String printStar(int n){
        if(n==0){
            return "";
        }
        return printStar(n-1)+"* ";
    }
    static void printRow(int n){
        if(n==0){
            return;
        }
        printRow(n-1);
        System.out.println(printStar(n));
    }

    public static void main(String[] args) {
        // System.out.println(printStar(3));
        printRow(6);
    }
}
