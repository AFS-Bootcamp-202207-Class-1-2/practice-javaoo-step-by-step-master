package practice06;

import java.text.MessageFormat;

public class Teacher extends Person{

    private Klass klass;

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduceWith(Student student){
        String message = String.format("My name is %s. I am %d years old. I am a Teacher. ", this.name, this.age);
        if (student.getKlass().getNumber() == this.klass.getNumber()){
            return message+String.format("I teach %s.", student.getName());
        }else {
            return message + String.format("I don't teach %s.", student.getName());

        }
    }

    @Override
    public String introduce() {
        if (this.klass == null) {
            return String.format("My name is %s. I am %d years old. I am a Teacher. I teach No Class.", this.name, this.age);
        }else {
            return String.format("My name is %s. I am %d years old. I am a Teacher. I teach Class %d.", this.name, this.age, this.klass.getNumber());
        }
    }
}
