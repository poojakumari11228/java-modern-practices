package default_static_methods.static_methods;

public interface Person {

    String getName();

    int getAge();

    /* add default keyword and provide default implementation for method
     * */
    default String getNameAndAge() {
        return "Name : " + getName() + "\nAge : " + getAge();
    }
    default double startingSalary() {
        return 50000;
    }

    /* add static keyword and provide implementation  * */
    static int staticMethodExample(){
        java.util.Random rand = new java.util.Random();
        System.out.println("Static Method Implementation");
        return rand.nextInt(100);
    }

}
