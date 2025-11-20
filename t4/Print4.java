public class Print4 {
    public static void main(String[] args) {
        for(int r=1;r<=7;r++){
            for(int c=1;c<=6;c++){
                if(r+c==6 || r==5 || c==5){
                    System.out.print("* ");
                } else {
                    // System.out.print(c+""+r+" ");
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}
