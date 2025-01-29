package behavioral.chainresponsibility.pattern;

/**
 * Abstract base class for handlers, providing common functionality for setting and invoking the next handler.
 */
public abstract class BaseHandler implements Handler {

    private Handler nextHandler;

    /**
     * Sets the next handler in the chain.
     *
     * @param handler the next handler to set
     * @return the handler to allow chaining
     */
    @Override
    public Handler setNext(Handler handler) {
        this.nextHandler = handler;
        return handler;
    }

    /**
     * Invokes the next handler in the chain if it exists.
     *
     * @param request the request to handle
     */
    @Override
    public void handle(String request) {
        if (this.nextHandler != null) {
            this.nextHandler.handle(request);
        }
    }
}
