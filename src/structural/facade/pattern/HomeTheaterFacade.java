package structural.facade.pattern;

/**
 * The HomeTheaterFacade class provides a simplified interface to control
 * multiple components of a home theater system.
 * It acts as a facade, hiding the complexity of individual components.
 */
public class HomeTheaterFacade {
    private final Projector projector;
    private final SoundSystem soundSystem;
    private final VideoPlayer videoPlayer;

    /**
     * Constructs a HomeTheaterFacade with the specified components.
     *
     * @param projector   The projector component.
     * @param soundSystem The sound system component.
     * @param videoPlayer The video player component.
     */
    public HomeTheaterFacade(Projector projector, SoundSystem soundSystem, VideoPlayer videoPlayer) {
        this.projector = projector;
        this.soundSystem = soundSystem;
        this.videoPlayer = videoPlayer;
    }

    /**
     * Starts the process of watching a movie by turning on all components
     * and playing the specified movie.
     *
     * @param movie The name of the movie to watch.
     */
    public void watchMovie(String movie) {
        System.out.println("Loading....");
        this.projector.turnOn();
        this.soundSystem.on();
        this.videoPlayer.on();
        this.videoPlayer.play(movie);
        System.out.println("Enjoy your movie!");
    }

    /**
     * Ends the movie watching session by stopping and turning off all components.
     */
    public void endWatchingMovie() {
        System.out.println("\n\nStopping....");
        this.projector.turnOff();
        this.soundSystem.off();
        this.videoPlayer.stop();
        this.videoPlayer.off();
        System.out.println("Turn off system!");
    }
}

