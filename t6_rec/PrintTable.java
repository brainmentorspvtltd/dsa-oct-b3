public class PrintTable {
    static String printTable(int num, int c){
        // base case 
        if(c==0){
            return "";
        }
        String rs = printTable(num, c-1);
        String cs = num+" * "+ c+" = "+ (num*c)+"\n";
        return rs + cs;
    }

    public static void main(String[] args) {
        String r = printTable(5, 4);
        System.out.println(r);
    }
}
