package behavioral.observer.task;

/**
 * Represents a weather app that receives weather updates from the weather station.
 */
class WeatherApp implements Observer {
    private final String name; // Name of the weather app

    /**
     * Constructs a weather app with the specified name.
     *
     * @param name The name of the weather app
     */
    public WeatherApp(String name) {
        this.name = name;
    }

    /**
     * Receives and processes weather updates from the weather station.
     *
     * @param weatherData The updated weather data
     */
    @Override
    public void update(String weatherData) {
        System.out.println(this.name + " received weather update: " + weatherData);
    }
}
