package tasks_6_level.task24_aplusb123;

public class Dinglemouse {

	public static long int123(final int a) {

		long b;
		int maxValue = Integer.MAX_VALUE;

		b = 123 - a;

		if (b < 0) {
			b = (long) 2*maxValue - a + 125L;
		}
		System.out.println("long b = " + b);
		System.out.println("int b = " + (int) b);

		return b;
	}

}
