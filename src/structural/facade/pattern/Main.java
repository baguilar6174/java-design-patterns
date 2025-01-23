package structural.facade.pattern;

/**
 * Demonstrates the use of the HomeTheaterFacade to simplify the process of
 * watching and ending a movie session.
 */
public class Main {
    public static void main(String[] args) {

        // Create individual components
        Projector projector = new Projector();
        SoundSystem soundSystem = new SoundSystem();
        VideoPlayer videoPlayer = new VideoPlayer();

        // Create the home theater facade
        HomeTheaterFacade theater = new HomeTheaterFacade(projector, soundSystem, videoPlayer);

        // Watch a movie using the facade
        theater.watchMovie("Avengers");
        /*
        * Result:
        *
        * Loading....
        * Projector turn on!
        * Sound system on!
        * Video Player on!
        * Playing Avengers
        * Enjoy your movie!
        * */

        // End the movie session using the facade
        theater.endWatchingMovie();

        /*
        * Result:
        *
        * Stopping....
        * Projector turn off!
        * Sound system off!
        * Stop movie
        * Video player off!
        * Turn off system!
        * */
    }
}
