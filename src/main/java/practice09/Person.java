package practice09;

public class Person {

    protected int id;
    protected String name;
    protected int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce() {
        return String.format("My name is %s. I am %s years old.", this.name, this.age);
    }

    @Override
    public boolean equals(Object obj) {
        return this.id == ((Person) obj).getId();
    }
}
