public class Main {
    public static void main(String[] args) {
        // Створюємо об'єкти Day та Weather для тестування
        Day day1 = new Day("2024-05-01", 20, "Сонячно");
        Day day2 = new Day("2024-05-02", 22, "Трохи хмарно");
        Day day3 = new Day("2024-05-03", 18, "Без опадів");

        Weather weather = new Weather("Весна");
        weather.addDay(day1);
        weather.addDay(day2);
        weather.addDay(day3);

        // Використовуємо методи WeatherAnalyzer для отримання результатів
        System.out.println("Середня температура: " + WeatherAnalyzer.averageTemperature(weather));
        System.out.println("День з максимальною температурою: " + WeatherAnalyzer.dayWithMaxTemperature(weather));
        System.out.println("День з найдовшим коментарем: " + WeatherAnalyzer.dayWithLongestComment(weather));
    }
}
