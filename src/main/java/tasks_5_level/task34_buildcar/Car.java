package tasks_5_level.task34_buildcar;

public class Car {
	public Body body;
	public Chassis chassis;

	public Car(int length, int doors) throws Exception {
		if (length < 7 || doors < 1)
			throw new Exception();
		body = new Body(length, doors);
		chassis = new Chassis(length);
	}
}

class Body {
	public String component;

	public Body(int length, int doors) {
		// roof
		component = " " + "_".repeat(length - 3) + "\n";
		// doors
		component += "|";
		component += "[]".repeat(doors / 2);
		component += " ".repeat(length - 3 - 2 * doors); // length - basic length - amount of doors
		component += "[]".repeat((1 + doors) / 2);
		component += "\\\n";
	}
}

class Chassis {
	public String component;

	public Chassis(int length) {
		component = "-o";
		if (length < 12) {
			component += "-".repeat(length - 5);
		} else {
			component += "-o".repeat(1 + (length - 12) / 4);
			component += "-".repeat(length - 5 - 2 * (1 + (length - 12) / 2)); // length - basic length - amount of
																				// additional wheels
			component += "o-".repeat((length - 10) / 4);
		}
		component += "o-'";
	}
}
