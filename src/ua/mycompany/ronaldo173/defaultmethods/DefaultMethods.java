package ua.mycompany.ronaldo173.defaultmethods;

public class DefaultMethods implements DefaultTest, DefaultTest2 {
	public static void main(String[] args) {
		new DefaultMethods().print();
		DefaultTest2.print();
	}
}

interface DefaultTest {
	default void print() {
		System.out.println("GGWP");
	}
}

interface DefaultTest2 {
	static void print() {
		System.out.println("GGWP_22");
	}
}
