package behavioral.chainresponsibility.pattern;

import java.util.Objects;

/**
 * ----------
 * Step 3
 * ----------
 * A concrete handler that handles basic support requests.
 */
public class BasicSupport extends BaseHandler {

    /**
     * Handles the request if it matches "basic", otherwise delegates to the next handler.
     *
     * @param request the request to handle
     */
    @Override
    public void handle(String request) {
        if (Objects.equals(request, "basic")) {
            System.out.println("Basic support: Solving basic problem");
            return;
        }
        System.out.println("You need advanced support");
        super.handle(request);
    }
}