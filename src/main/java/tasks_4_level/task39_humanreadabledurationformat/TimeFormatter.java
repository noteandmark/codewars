package tasks_4_level.task39_humanreadabledurationformat;

import java.util.ArrayList;
import java.util.List;

public class TimeFormatter {
    public static String formatDuration(int seconds) {
    	StringBuilder sb = new StringBuilder();
        
        if (seconds == 0) return "now";
        
        List<String> components = new ArrayList<>();
        
        int years = seconds / (365 * 24 * 60 * 60);
        if (years > 0) {
            components.add(years + (years > 1 ? " years" : " year"));
        }

        int days = (seconds % (365 * 24 * 60 * 60)) / (24 * 60 * 60);
        if (days > 0) {
            components.add(days + (days > 1 ? " days" : " day"));
        }

        int hours = (seconds % (24 * 60 * 60)) / (60 * 60);
        if (hours > 0) {
            components.add(hours + (hours > 1 ? " hours" : " hour"));
        }

        int minutes = (seconds % (60 * 60)) / 60;
        if (minutes > 0) {
            components.add(minutes + (minutes > 1 ? " minutes" : " minute"));
        }

        int remainingSeconds = seconds % 60;
        if (remainingSeconds > 0) {
            components.add(remainingSeconds + (remainingSeconds > 1 ? " seconds" : " second"));
        }

        for (int i = 0; i < components.size(); i++) {
            sb.append(components.get(i));
            if (i < components.size() - 2) {
                sb.append(", ");
            } else if (i == components.size() - 2) {
                sb.append(" and ");
            }
        }
        
		return sb.toString();
    }
}
