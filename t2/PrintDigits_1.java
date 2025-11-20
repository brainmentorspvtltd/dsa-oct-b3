public class PrintDigits_1 {
    public static void main(String[] args) {
        int num = 43782;
        // String str = num+"";
        String str = String.valueOf(num);
        System.out.println(str.length());
        // 4 3 7 8 2 
        // 0 1 2 3 4 -> index
        // 1 2 3 4 5 -> position
        int index = 0;
        while(index<str.length()){
            System.out.println(str.charAt(++index));
            // ++index;
        }
    }
}
