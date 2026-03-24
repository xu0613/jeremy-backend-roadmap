package teacherAndStudent;

public abstract class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    abstract void workOrStudy();

}
