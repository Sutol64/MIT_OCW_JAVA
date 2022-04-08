public class WeatherTest {
	public static void main(String[] args) {
		Weather today= new Weather(40.0, 0.0);
		City boston= new City("Boston", today);
		City cambridge= new City("Cambridge", today);
		
		// Now revise the Boston weather, which was corrected
		Weather bostonToday= boston.getWeather();
		bostonToday.setAvgTemp(41.0);
		System.out.println("Boston: " + boston.getWeather());
		System.out.println("Cambridge: "+ cambridge.getWeather());
	}
}