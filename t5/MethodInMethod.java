public class MethodInMethod {
    static void greet(String name, int count){
        // base case / termination case
        if(count==5){
            return;
        }
        // System.out.println("Welcome "+name+": "+count);
        // recursion call / small problem
        greet(name, count+1);
        System.out.println("Welcome "+name+": "+count);
    }
    public static void main(String[] args) {
        greet("Ramesh", 0);
    }
}
