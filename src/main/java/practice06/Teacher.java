package practice06;

public class Teacher extends Person{
    private int klass;
    public Teacher(String name, int age,int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
        this.setKlass(0);
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if(this.getKlass()!=0) {
            return "My name is "+this.getName() + ". I am " + this.getAge() +" years old. I am a Teacher. I teach Class " + this.getKlass() +".";
        }
        return  "My name is "+this.getName() + ". I am " + this.getAge() +" years old. I am a Teacher. I teach No Class.";
    }
}
