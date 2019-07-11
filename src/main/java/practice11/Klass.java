package practice11;

import java.util.ArrayList;

public class Klass {
    private int klass;
    private String displayName;
    private Person jerry;
    private Teacher teacher;
    private ArrayList<Student> arrayList;
    public Klass(int klass) {
        this.klass = klass;
        jerry = new Student();
        arrayList = new ArrayList<>();
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getNumber() {
        return this.klass;
    }
    public void setKlass(int klass){
        this.klass = klass;
    }
    public String getDisplayName() {
        if(this.getNumber()!=0)
            return "Class "+this.getNumber();
        return "";
    }

    public void assignLeader(Student jerry) {
        if(jerry.getKlass().getNumber()==this.klass){
            this.jerry = jerry;
        }else{
            System.out.print("It is not one of us.\n");
        }
//         return "";
    }

    public Person getLeader() {
        return this.jerry;
    }

    public void appendMember(Student jerry1) {
        arrayList.add(jerry1);
        System.out.println(this.teacher.getName());
        System.out.println("I am "+this.teacher.getName()+". I know "+jerry1.getName()+" has joined Class"+ this.getNumber()+".\n");
    }
}
