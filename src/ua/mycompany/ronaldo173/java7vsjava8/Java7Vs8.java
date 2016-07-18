package ua.mycompany.ronaldo173.java7vsjava8;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * Start of tutorial. Test comparing in java7, 8.
 * 
 * @author Alexandr Efimov
 *
 */
public class Java7Vs8 {
	public static void main(String[] args) {
		List<String> names1 = new ArrayList<String>();
		names1.add("Mahesh ");
		names1.add("Suresh ");
		names1.add("Ramesh ");
		names1.add("Naresh ");
		names1.add("Kalpesh ");

		List<String> names2 = new ArrayList<String>();
		names2.add("Mahesh ");
		names2.add("Suresh ");
		names2.add("Ramesh ");
		names2.add("Naresh ");
		names2.add("Kalpesh ");

		sortViaJava7(names1);
		System.out.println("Java7: ");
		System.out.println(names1);

		sortViaJava8(names2);
		System.out.println("Java8: ");
		System.out.println(names2);
	}

	private static void sortViaJava8(List<String> list) {
		Collections.sort(list, (s1, s2) -> s1.compareTo(s2));
	}

	private static void sortViaJava7(List<String> list) {
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
	}

}
