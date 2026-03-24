package teacherAndStudent;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Student("Jeremy", 19);
        Person p2 = new Teacher("Wilson", 30);

        p1.showInfo();
        p2.showInfo();
        p1.workOrStudy();
        p2.workOrStudy();
    }
}
