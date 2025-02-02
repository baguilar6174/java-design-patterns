package behavioral.observer.task;

/**
 * Client code to demonstrate the Observer Pattern.
 */
public class Main {
    public static void main(String[] args) {
        // Create a weather station
        WeatherStation weatherStation = new WeatherStation();

        // Create weather apps
        WeatherApp flutterWeatherApp = new WeatherApp("Flutter WeatherApp");
        WeatherApp reactNativeWeatherApp = new WeatherApp("React Native WeatherApp");
        WeatherApp weatherTrackerApp = new WeatherApp("Weather Tracker App");

        // Subscribe weather apps to the weather station
        weatherStation.subscribe(flutterWeatherApp);
        weatherStation.subscribe(reactNativeWeatherApp);

        // Update the weather and notify observers
        weatherStation.setWeather("Rainy");

        // Subscribe another weather app
        weatherStation.subscribe(weatherTrackerApp);
        weatherStation.setWeather("Cloudy");

        // Unsubscribe a weather app
        weatherStation.unsubscribe(reactNativeWeatherApp);
        weatherStation.setWeather("Thunderstorm");
    }
}