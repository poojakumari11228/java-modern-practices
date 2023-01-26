package default_static_methods.clashes.static_clash;

public interface Super1 {
	static int myMethod() {
		System.out.println("Super1");
		return 1;
	}
}
