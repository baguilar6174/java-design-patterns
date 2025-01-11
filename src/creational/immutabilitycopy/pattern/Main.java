package creational.immutabilitycopy.pattern;

/**
 * ----------
 * Step 3
 * ----------
 * Utility class to demonstrate create a history of states.
 * This class showcases the Immutability with copy Pattern in action.
 */
public class Main {

    public static void main(String[] args) {
        CodeEditorHistory history = new CodeEditorHistory();
        CodeEditorState state = new CodeEditorState("int a = 1;", 2, false);

        System.out.println("Initial state: \n");
        history.save(state);
        state.displayState();

        /*
        * Result
        *
        * Editor State
        * Content: int a = 1;
        * Cursor position line: 2
        * Unsaved changes?: false
        * */

        System.out.println("\nAfter first change: \n");
        state = state.copyWith("int b = 2;", 3, true);
        history.save(state);
        state.displayState();

        /*
         * Result
         *
         * Editor State
         * Content: int b = 2;
         * Cursor position line: 3
         * Unsaved changes?: true
         * */

        System.out.println("\nAfter move cursor: \n");
        state = state.copyWith(null, 4, true);
        history.save(state);
        state.displayState();

        /*
         * Result
         *
         * Editor State
         * Content: int b = 2;
         * Cursor position line: 4
         * Unsaved changes?: true
         * */

        System.out.println("\nAfter UNDO: \n");
        state = history.undo();
        state.displayState();

        /*
         * Result
         *
         * Editor State
         * Content: int b = 2;
         * Cursor position line: 3
         * Unsaved changes?: true
         * */

        System.out.println("\nAfter REDO: \n");
        state = history.redo();
        state.displayState();

        /*
         * Result
         *
         * Editor State
         * Content: int b = 2;
         * Cursor position line: 4
         * Unsaved changes?: true
         * */
    }
}
