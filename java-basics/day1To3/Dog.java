package day1To3;

class Dog {
    String name;
    int age;

    void setInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showInfo() {
        System.out.println("My dog is " + name + ".");
        System.out.println("It is " + age + " years old.");
    }

    void bark() {
        System.out.println(name + " is barking");
    }
}
