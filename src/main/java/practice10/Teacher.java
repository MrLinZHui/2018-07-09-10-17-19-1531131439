package practice10;

import java.util.Collection;
import java.util.LinkedList;

public class Teacher extends Person{
    private Klass klass;
    private LinkedList<Klass> linkedList = new LinkedList<Klass>();
    public Teacher(int id,String name, int age,LinkedList<Klass> linkedList) {
        super(id,name, age);
        this.linkedList = linkedList;
    }
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
        if(this.linkedList.size()>0) {
            return "My name is "+this.getName() + ". I am " + this.getAge() +" years old. I am a Teacher. I teach Class " + this.printClass(linkedList) +".";
        }
        return  "My name is "+this.getName() + ". I am " + this.getAge() +" years old. I am a Teacher. I teach No Class.";
    }
    public String printClass(LinkedList<Klass> linkedList){
        String print = "";
        for(int i = 0;i<linkedList.size();i++){
            print += linkedList.get(i).getNumber()+", ";
        }
        return print.substring(0,print.length()-2);
    }
    public String introduceWith(Student jerry) {
        if(this.linkedList.size()==0){
            return  "My name is "+this.getName() + ". I am " + this.getAge() +" years old. I am a Teacher. I teach No Class.";
        }
        if(linkedList.contains(jerry.getKlass())){
            return "My name is "+this.getName() + ". I am " + this.getAge() +" years old. I am a Teacher. I teach " + jerry.getName() +".";
        }
            return "My name is " + this.getName() + ". I am " + this.getAge() + " years old. I am a Teacher. I don't teach " + jerry.getName() + ".";

    }
    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }


    public Collection<Klass> getClasses() {
        return this.linkedList;
    }

    public boolean isTeaching(Student jerry) {
//        if(linkedList.contains(jerry.getKlass())){
//            return true;
//        }
        return linkedList.contains(jerry.getKlass())?true:false;
    }
}

