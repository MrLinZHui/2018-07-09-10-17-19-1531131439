package practice02;

public class Student {
    private String name;
    private int age;
    private int ClassId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getKlass() {
        return this.ClassId;
    }

    public void setClass(int aClass) {
        ClassId = aClass;
    }

    public Student(String name, int age, int aClass) {
        this.name = name;
        this.age = age;
        this.ClassId = aClass;
    }

    public String introduce() {
        return "I am a Student. I am at Class " + this.getKlass() +".";
    }
}
