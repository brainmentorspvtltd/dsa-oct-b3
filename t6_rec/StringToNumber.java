public class StringToNumber {
    static String convert(int num){
        // base case
        if(num==0){
            return "";
        }
        String cs = "";
        switch(num%10){
            case 0:
                cs = "Zero";
                break;
            case 1:
                cs = "One";
                break;
            case 2:
                cs = "Two";
                break;
            case 3:
                cs = "Three";
                break;
            default:
                break;
        }
        return convert(num/10) + " " + cs;
    }
    public static void main(String[] args) {
        String r = convert(1363); // One Three
        System.out.println(r);
    }
}
