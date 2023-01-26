package default_static_methods.clashes.class_interface_clash;

public class Impl extends SuperClass implements SuperInterf {

	// in this case the priority goes to the class implementation

	public void myMethod() {
		System.out.println("Sub Class");
	}
	public static void main(String[] args) {
		Impl impl = new Impl();
		impl.myMethod();
	}
}
