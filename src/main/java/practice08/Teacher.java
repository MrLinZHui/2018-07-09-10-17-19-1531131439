package practice08;

public class Teacher extends Person{
    private Klass klass;
    public Teacher(int id,String name, int age,Klass klass) {
        super(id,name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        this.klass = new Klass(0);
    }

    @Override
    public String introduce() {
        if(this.klass.getNumber()!=0) {
            return "My name is "+this.getName() + ". I am " + this.getAge() +" years old. I am a Teacher. I teach Class " + this.klass.getNumber() +".";
        }
        return  "My name is "+this.getName() + ". I am " + this.getAge() +" years old. I am a Teacher. I teach No Class.";
    }
    public String introduceWith(Student jerry) {
        if(this.klass.getNumber()==0){
            return  "My name is "+this.getName() + ". I am " + this.getAge() +" years old. I am a Teacher. I teach No Class.";
        }
        if(jerry.getKlass().getNumber()==this.klass.getNumber()){
            return "My name is "+this.getName() + ". I am " + this.getAge() +" years old. I am a Teacher. I teach " + jerry.getName() +".";
        }
        return "My name is "+this.getName() + ". I am " + this.getAge() +" years old. I am a Teacher. I don't teach " + jerry.getName() +".";
    }
    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }
}
