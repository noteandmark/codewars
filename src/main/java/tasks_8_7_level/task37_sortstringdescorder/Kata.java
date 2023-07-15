package tasks_8_7_level.task37_sortstringdescorder;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Kata {
	public static String[] lineupStudents(String students) {
		String[] res = students.split(" ");

		List<String> listStudents = Arrays.asList(res);

		// Sort the list based on the specified conditions
		Collections.sort(listStudents, (name1, name2) -> {
			// Compare based on length in descending order
			int lengthComparison = Integer.compare(name2.length(), name1.length());
			if (lengthComparison != 0) {
				return lengthComparison;
			}
			// Compare lexicographically in reverse order
			return name2.compareTo(name1);
		});

		String[] sortedNames = listStudents.toArray(new String[0]);

		return sortedNames;
	}
}

//found best decision
//return Stream.of(students.split(" "))
//	      .sorted(comparingInt(String::length).thenComparing(identity()).reversed())
//	      .toArray(String[]::new);
