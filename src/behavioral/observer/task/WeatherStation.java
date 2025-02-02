package behavioral.observer.task;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a weather station that notifies its observers when the weather changes.
 */
class WeatherStation {
    private final List<Observer> observers = new ArrayList<>(); // List of observers
    private String weatherData = "Sunny"; // Current weather data

    /**
     * Subscribes an observer to the weather station.
     *
     * @param observer The observer to subscribe
     */
    public void subscribe(Observer observer) {
        this.observers.add(observer);
        observer.update(this.weatherData); // Notify the observer immediately after subscription
        System.out.println("New app subscribed to the weather station.");
    }

    /**
     * Unsubscribes an observer from the weather station.
     *
     * @param observer The observer to unsubscribe
     */
    public void unsubscribe(Observer observer) {
        this.observers.remove(observer);
        System.out.println("An app has unsubscribed from the weather station.");
    }

    /**
     * Updates the weather data and notifies all observers.
     *
     * @param weatherData The new weather data
     */
    public void setWeather(String weatherData) {
        System.out.println("\nWeather updated: " + weatherData);
        this.weatherData = weatherData;
        this.notifyObservers(); // Notify all observers about the change
    }

    /**
     * Notifies all observers with the current weather data.
     */
    private void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.update(this.weatherData);
        }
    }
}