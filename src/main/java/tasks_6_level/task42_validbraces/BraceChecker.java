package tasks_6_level.task42_validbraces;

public class BraceChecker {
	public boolean isValid(String braces) {
	    while (braces.contains("()") || braces.contains("[]") || braces.contains("{}")) {
	    	braces = braces.replace("()", "").replace("[]", "").replace("{}", "");
	    }
		return braces.isEmpty();
	}
}
