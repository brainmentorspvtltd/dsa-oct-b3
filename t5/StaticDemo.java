class MyDemo {
    void test1() {}
    static void test2() {}

}

public class StaticDemo {

    public static void main(String[] args) {
        // MyDemo md = new MyDemo();
        // md.test1();
        // md.test2();

        MyDemo.test2();
        // MyDemo.test1();
    }
}
