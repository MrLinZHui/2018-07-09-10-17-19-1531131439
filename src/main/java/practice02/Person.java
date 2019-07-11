package practice02;

public class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String introduce() {
        return "My name is " + this.getName()+". I am " + this.getAge() + " years old.";
    }
}
