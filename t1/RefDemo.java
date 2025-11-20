package t1;
class Student{
    String name;
    Student(String n){
        name = n;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + "]";
    }
}
public class RefDemo {
    public static void main(String[] args) {
        Student n = new Student("Ramesh");
        Student std = n;
        std.name = "Mahesh";
        System.out.println(n);
    }
}
