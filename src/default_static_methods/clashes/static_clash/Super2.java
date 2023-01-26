package default_static_methods.clashes.static_clash;

public interface Super2 {
	public static int myMethod() {
		System.out.println("Super2");
		return 2;
	}
}
