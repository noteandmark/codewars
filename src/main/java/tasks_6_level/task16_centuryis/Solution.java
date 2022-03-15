package tasks_6_level.task16_centuryis;

public class Solution {
    public static String whatCentury(int year) {
        int century = Integer.parseInt(String.valueOf(year-1).substring(0, 2)) + 1;
        StringBuilder result = new StringBuilder();
        result.append(century);
        String appendix = "";
        int caseResult = 0;
        int firstDigit = 0;
        if (century/20 < 1) {
            caseResult = 20;
        } else {
            caseResult = Integer.parseInt(String.valueOf(century).substring(1,2));
            firstDigit = Integer.parseInt(String.valueOf(century).substring(0,1));
        }
        switch (caseResult) {
            case 20:
                appendix = "th";
                break;
            case 1:
                appendix = "st";
                break;
            case 2:
                appendix = "nd";
                break;
            case 3:
                appendix = "rd";
                break;
            default:
                appendix = "th";
                break;
        }
        result.append(appendix);
        return result.toString();
    }
}

/*

the best practice on my opinion is :

  public static String whatCentury(int year) {
    int century = (year + 99) / 100;
    if (century / 10 == 1) return century + "th";
    switch(century % 10) {
      case 1: return century + "st";
      case 2: return century + "nd";
      case 3: return century + "rd";
      default: return century + "th";
    }
   }
 */