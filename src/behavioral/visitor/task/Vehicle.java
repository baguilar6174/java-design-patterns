package behavioral.visitor.task;

/**
 * Vehicle interface with an accept method for visitors.
 */
interface Vehicle {
    void accept(Visitor visitor);
}

