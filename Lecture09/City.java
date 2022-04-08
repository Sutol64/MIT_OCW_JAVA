public class City {
	private String name;
	private Weather cityWeather;
	
	public City(String n, Weather c) {
		name= n;
		cityWeather= c;
	}
	
	public String getName() {
		return name;
	}
	
	public Weather getWeather() {
		return cityWeather;
	}
}
