package default_static_methods.clashes.diamond_prob;
public interface Super1Level2 extends SuperLevel1{
	default int myMethod() {
		System.out.println("Super-1 Level-2");
		return 2;
	}
}
