package default_static_methods.preJava8_issue;
public class Programmer implements Person{

    private String name;
    private int age;

    public Programmer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }
}
