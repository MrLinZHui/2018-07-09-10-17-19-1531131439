package practice09;

import java.io.OutputStream;

public class Klass {
    private int klass;
    private String displayName;
    private Student jerry;
    public Klass(int klass) {
        this.klass = klass;
        jerry = new Student();
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

    public Student getLeader() {
        return this.jerry;
    }

    public void appendMember(Student jerry) {

    }
}
