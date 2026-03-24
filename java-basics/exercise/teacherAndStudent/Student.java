package teacherAndStudent;

public class Student extends Person {

    Student(String name, int age) {
        super(name, age);
    }

    @Override
    void workOrStudy() {
        System.out.println("Study.");
    }
}
