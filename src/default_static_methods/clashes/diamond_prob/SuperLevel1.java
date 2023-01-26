package default_static_methods.clashes.diamond_prob;
public interface SuperLevel1 {
    public default int myMethod()
    {
        System.out.println("Super Level - 1");
        return 1;
    }
}
