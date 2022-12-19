package default_static_methods.deafault_methods;

public class Main {
    public static void main(String[] args) {
        Person author = new Author("ELien", 20);
        System.out.println(author.getNameAndAge());

        Programmer programmer = new Programmer("Jard", 30);
        System.out.println(programmer.getNameAndAge());

        System.out.println("------- Default method override ------");
        System.out.println(author.startingSalary());
        System.out.println(programmer.startingSalary());


    }

}
