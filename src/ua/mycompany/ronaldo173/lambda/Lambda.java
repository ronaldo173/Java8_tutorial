package ua.mycompany.ronaldo173.lambda;

public class Lambda {

	public static void main(String[] args) {
		System.out.println("Hello Lambda!");

		MathOperations addOperation = (a, b) -> a + b;
		MathOperations substractOperation = (int a, int b) -> a - b;
		MathOperations multOperation = (a, b) -> a * b;
		MathOperations divisOperation = (a, b) -> a / b;

		System.out.println(count(10, 5, addOperation));
		System.out.println(count(10, 5, substractOperation));
		System.out.println(count(10, 5, multOperation));
		System.out.println(count(10, 5, divisOperation));

	}

	public static int count(int a, int b, MathOperations operation) {
		return operation.operation(a, b);
	}
}

interface MathOperations {
	int operation(int a, int b);
}
