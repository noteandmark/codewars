package tasks_8_7_level.task23_countsheeps;

public class Counter {

	public int countSheeps(Boolean[] arrayOfSheeps) {
		int numb = 0;

		for (int i = 0; i < arrayOfSheeps.length; i++) {
			if (arrayOfSheeps[i] != null && arrayOfSheeps[i] == true) {
				numb++;
			}
		}

		return numb;
	}
}