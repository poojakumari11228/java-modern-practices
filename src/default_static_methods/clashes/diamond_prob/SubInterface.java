package default_static_methods.clashes.diamond_prob;
public interface SubInterface extends Super1Level2, Super2Level2{

    /* To resolve clash
     * either make the method abstract or override the default method as done below
     */

    @Override default int myMethod() {
        System.out.println("Sub Interface");
        return 4;
    }

//    OR
//    int myMethod();


}
