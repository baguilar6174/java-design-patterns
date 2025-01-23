package structural.facade.pattern;

/**
 * Represents a Video Player in the home theater.
 * Provides methods to control the video player, including playing and stopping movies.
 */
public class VideoPlayer {

    /**
     * Turns on the video player.
     */
    public void on() {
        System.out.println("Video Player on!");
    }

    /**
     * Plays the specified movie.
     *
     * @param movie The name of the movie to play.
     */
    public void play(String movie) {
        System.out.println("Playing " + movie);
    }

    /**
     * Stops the currently playing movie.
     */
    public void stop() {
        System.out.println("Stop movie");
    }

    /**
     * Turns off the video player.
     */
    public void off() {
        System.out.println("Video player off!");
    }
}
