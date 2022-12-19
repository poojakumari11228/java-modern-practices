package default_static_methods.deafault_methods;

import  java.util.Random;
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

}
