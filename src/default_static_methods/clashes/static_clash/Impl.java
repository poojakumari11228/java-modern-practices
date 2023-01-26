package default_static_methods.clashes.static_clash;

public class Impl implements Super1, Super2 {
	public static int myMethod() {
		System.out.println("Implementation Class");
		return 3;
	}
	public static void main(String[] args) {
		Super1 s = new Impl();
		System.out.println(Impl.myMethod());
		System.out.println(myMethod());
		System.out.println(Super1.myMethod());
	}

}
