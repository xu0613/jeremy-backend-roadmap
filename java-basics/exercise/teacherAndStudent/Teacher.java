package teacherAndStudent;

public class Teacher extends Person {

    Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    void workOrStudy() {
        System.out.println("Work.");
    }
}
