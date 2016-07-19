package ua.mycompany.ronaldo173.methodreference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodReference {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("second");
		list.add("first");
		list.add("third");

		list.forEach(System.out::println);
		System.out.println("\n");

		list.sort((s1, s2) -> s1.compareTo(s2));
		list.forEach(System.out::println);

		char c = 82;
		char[] arr = { (char) 82, (char) 117, (char) 115, (char) 115, (char) 105, (char) 97, (char) 110, (char) 95 };
		System.out.println(Arrays.toString(arr));
	}
}
