package ua.mycompany.ronaldo173.lambda;

public class LambdaInsteadAnonymous {
	private static final String HELLO = "Hello!";

	public static void main(String[] args) {
		GreetingService greetingService = mes -> System.out.println("message: " + mes);

		greetingService.sayMessage("bla bla");
		greetingService.sayMessage(HELLO);
		greetingService.sayMessage("das");
	}
}

interface GreetingService {
	void sayMessage(String message);
}