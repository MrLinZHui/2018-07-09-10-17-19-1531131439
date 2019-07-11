package practice11;

import java.util.ArrayList;

public class Klass {
    private int klass;
    private String displayName;
    private Person jerry;
    private ArrayList<Student> arrayList;
    public Klass(int klass) {
        this.klass = klass;
        jerry = new Student();
        arrayList = new ArrayList<>();
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
        System.out.println("I am Tom. I know Jerry has joined Class"+ this.getNumber()+".\n");
    }
}
