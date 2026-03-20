package day1To3;

class Student {
    String name;
    int age;
    String major;

    void setInfo(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    void introduce() {
        System.out.println("My name is " + name + ".");
        System.out.println("I am " + age + " years old.");
        System.out.println("My major is " + major + ".");
    }

    void study() {
        System.out.println(name + " is studying.");
    }
}
