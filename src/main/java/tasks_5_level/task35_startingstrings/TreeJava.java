package tasks_5_level.task35_startingstrings;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class TreeJava {
	  public static String[] solution(String str) {
		    HashMap<String, List<String>> startsWith = new HashMap<>();

		    for (String word : str.split("\\s+")) {
		      word = word.toLowerCase();
		      for (int i=0; i<word.length(); i++) {
		        List<String> list = startsWith.getOrDefault(word.substring(0,i+1), new ArrayList<String>());
		        list.add(word);
		        startsWith.putIfAbsent(word.substring(0,i+1), list);
		      }
		    }
		    
		  return startsWith.entrySet().stream()
		      .filter(e -> e.getKey().length()==e.getValue().size())
		      .flatMap(e -> e.getValue().stream())
		      .sorted()
		      .toArray(String[]::new);
		  }
}
