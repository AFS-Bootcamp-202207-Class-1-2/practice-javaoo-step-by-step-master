package practice08;

public class Klass {

    private int number;
    private Student leader;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName(){
        return "Class "+this.number;
    }

    public void assignLeader(Student student){
        if (student.getKlass() == null || student.getKlass().getNumber() != this.number) {
            System.out.println("It is not one of us.");
        }
        this.leader = student;
    }

    public void appendMember(Student student){
        student.changeKlass(this);
    }

    public Student getLeader() {
        return leader;
    }
}
