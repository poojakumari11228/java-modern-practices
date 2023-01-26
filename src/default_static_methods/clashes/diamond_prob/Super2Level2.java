package default_static_methods.clashes.diamond_prob;
public interface Super2Level2 extends SuperLevel1 {
	public default int myMethod() {
		System.out.println("Super-2 Level-2");
		return 3;
	}
}
