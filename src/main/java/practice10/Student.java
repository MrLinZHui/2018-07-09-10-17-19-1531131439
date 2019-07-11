package practice10;

public class Student extends Person{
    private Klass klass;
    public Student(int id,String name, int age,Klass klass) {
        super(id,name, age);
        this.klass = klass;
    }
    public Student(){

    }

    @Override
    public String introduce() {
        if(this.klass.getLeader().getId()==0) {
            return "My name is " + this.getName() + ". I am " + this.getAge() + " years old. " + "I am a Student. I am at Class " + this.klass.getNumber() + ".";
        }
        return "My name is " + this.getName() + ". I am " + this.getAge() + " years old. " +"I am a Student. I am Leader of Class " + this.klass.getNumber() + ".";
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

