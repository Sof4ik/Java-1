import java.util.ArrayList;

public class WeatherAnalyzer {
    public static double averageTemperature(Weather weather) {
        double totalTemperature = 0;
        ArrayList<Day> days = weather.getDays();
        for (Day day : days) {
            totalTemperature += day.getTemperature();
        }
        return totalTemperature / days.size();
    }

    public static String dayWithMaxTemperature(Weather weather) {
        ArrayList<Day> days = weather.getDays();
        Day maxTempDay = days.get(0);
        for (Day day : days) {
            if (day.getTemperature() > maxTempDay.getTemperature()) {
                maxTempDay = day;
            }
        }
        return maxTempDay.getDate();
    }

    public static String dayWithLongestComment(Weather weather) {
        ArrayList<Day> days = weather.getDays();
        Day longestCommentDay = days.get(0);
        for (Day day : days) {
            if (day.getComment().length() > longestCommentDay.getComment().length()) {
                longestCommentDay = day;
            }
        }
        return longestCommentDay.getDate();
    }
}
