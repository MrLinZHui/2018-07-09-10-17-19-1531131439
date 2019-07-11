package practice08;

public class Klass {
    private int klass;
    private String displayName;
    private Student jerry = null;
    public Klass(int klass) {
        this.klass = klass;
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
        this.jerry = jerry;
    }

    public Person getLeader() {
        return this.jerry;
    }
}
