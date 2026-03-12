public class PrintStar_2 {
    static void printStar(int max, int cr, int cc){
        if(cr>max){
            return;
        }
        if(cc<=cr){
            // print current '*'
            System.out.print("* ");
            printStar(max, cr, cc+1);
        } else {
            // change to next row
            System.out.println();
            printStar(max, cr+1, 1);
        }

    }
    public static void main(String[] args) {
        printStar(3, 1, 1);        
    }
}
