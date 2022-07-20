package practice07;

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

    public String assignLeader(Student student){
        leader = student;
        return student.introduce();
    }

    public Student getLeader() {
        return leader;
    }
}
