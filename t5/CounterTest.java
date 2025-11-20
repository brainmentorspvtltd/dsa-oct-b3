class Counter{
    static int count = 0;
}
// java ClassName
public class CounterTest {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        c1.count++;
        c1.count++;
        c1.count++;

        c2.count++;
        c2.count++; 
        System.out.println("C1: "+c1.count+", C2: "+c2.count);       
    }
}
