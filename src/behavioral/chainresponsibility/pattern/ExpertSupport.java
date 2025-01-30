package behavioral.chainresponsibility.pattern;

import java.util.Objects;

/**
 * ----------
 * Step 5
 * ----------
 * A concrete handler that handles expert-level support requests.
 */
public class ExpertSupport extends BaseHandler {

    /**
     * Handles the request if it matches "expert", otherwise reports that the problem cannot be solved.
     *
     * @param request the request to handle
     */
    @Override
    public void handle(String request) {
        if (Objects.equals(request, "expert")) {
            System.out.println("Expert support: Solving expert problem");
            return;
        }
        System.out.println("We can't solve the problem!");
    }
}