import java.util.Arrays;
import java.util.Comparator;

class Student {//implements Comparable{
    String name;
    int age;
    Student(String n, int a){
        name = n;
        age = a;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
    // @Override
    // public int compareTo(Object o) {
    //     Student input = (Student)o;

    //     // return this.name.compareTo(input.name);
    //     return this.age - input.age;
    // }
    
}

public class SortingDemo {
    public static void main(String[] args) {
        // int[] nums = {3,5,2,6};
        // // sort -> 2 3 5 6
        // Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));

        // String[] names = {"ramesh","suresh", "mahesh", "ganesh"};
        // Arrays.sort(names);
        // System.out.println(Arrays.toString(names));

        Student s1 = new Student("ramesh", 27);
        Student s2 = new Student("suresh", 23);
        Student s3 = new Student("mahesh", 25);
        Student s4 = new Student("ganesh",29);
        Student[] stds = {s1,s2,s3,s4};

        Comparator<Student> sortingByName = (std1, std2) ->
                 std1.name.compareTo(std2.name);
            
        Arrays.sort(stds, sortingByName);
        System.out.println(Arrays.toString(stds));
    }
}
