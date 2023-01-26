package default_static_methods.clashes.class_interface_clash;

public interface SuperInterf {
	default void myMethod() {
		System.out.println("Super Interface");
	}
}
