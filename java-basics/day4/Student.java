package day4;

public class Student {
    private String name;
    private int age;
    private String major;

    Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    String getMajor() {
        return major;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age.");
        }
    }

    void setMajor(String major) {
        this.major = major;
    }

    void introduce() {
        System.out.println("My name is " + name + ".");
        System.out.println("I am " + age + " years old.");
        System.out.println("My major is " + major + ".");
    }
}
