package ua.mycompany.ronaldo173.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterfacer {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		eval(list, new Predicate<Integer>() {
			@Override
			public boolean test(Integer n) {
				return true;
			}
		});

		// equals
		eval(list, number -> true);

		eval(list, n -> n % 2 == 0);
		eval(list, a -> a % 2 != 0);
		eval(list, a -> a > 2);

	}

	public static void eval(List<Integer> list, Predicate<Integer> predicate) {

		for (Integer integer : list) {
			if (predicate.test(integer)) {
				System.out.print(integer + " ");
			}
		}
		System.out.println();
	}
}
