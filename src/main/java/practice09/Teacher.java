package practice09;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.LinkedList;

public class Teacher extends Person{

    private LinkedList<Klass> classes;

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public String introduceWith(Student student){
        if (this.classes.stream().anyMatch(klass -> klass.getNumber() == student.getKlass().getNumber())){
            return super.introduce() + String.format(" I am a Teacher. I teach %s.", student.getName());
        }else {
            return super.introduce() + String.format(" I am a Teacher. I don't teach %s.", student.getName());
        }
    }

    @Override
    public String introduce() {
        if (this.classes != null && this.classes.size() != 0) {
            StringBuilder msg = new StringBuilder(super.introduce() + " I am a Teacher. I teach Class ");
            for (int i = 0; i < this.classes.size(); i++) {
                if (i == this.classes.size() - 1) {
                    msg.append(this.classes.get(i).getNumber());
                }else {
                    msg.append(this.classes.get(i).getNumber())
                            .append(", ");
                }
            }
            return msg.append(".").toString();
        }else {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
    }

    public boolean isTeaching(Student student){
        return this.classes.stream().anyMatch(klass -> klass == student.getKlass());
    }

}
