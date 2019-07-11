package practice07;

public class Klass {
    private int klass;
    private String displayName;
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
        return "Class 2";
    }
}
