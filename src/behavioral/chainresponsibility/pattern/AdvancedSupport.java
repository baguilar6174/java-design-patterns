package behavioral.chainresponsibility.pattern;

import java.util.Objects;

/**
 * A concrete handler that handles advanced support requests.
 */
public class AdvancedSupport extends BaseHandler {

    /**
     * Handles the request if it matches "advanced", otherwise delegates to the next handler.
     *
     * @param request the request to handle
     */
    @Override
    public void handle(String request) {
        if (Objects.equals(request, "advanced")) {
            System.out.println("Advanced support: Solving advanced problem");
            return;
        }
        System.out.println("You need expert support");
        super.handle(request);
    }
}

