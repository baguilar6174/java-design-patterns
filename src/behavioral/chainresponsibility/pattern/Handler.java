package behavioral.chainresponsibility.pattern;

/**
 * The Handler interface represents a contract for handling requests.
 * It defines a method to set the next handler in the chain and a method to handle requests.
 */
public interface Handler {

    /**
     * Sets the next handler in the chain.
     *
     * @param handler the next handler to set
     * @return the handler to allow chaining
     */
    Handler setNext(Handler handler);

    /**
     * Handles a given request.
     *
     * @param request the request to handle
     */
    void handle(String request);
}
