package behavioral.observer.task;

/**
 * Represents an observer that can be notified of weather updates.
 */
interface Observer {
    /**
     * Updates the observer with the latest weather data.
     *
     * @param weatherData The updated weather data
     */
    void update(String weatherData);
}
