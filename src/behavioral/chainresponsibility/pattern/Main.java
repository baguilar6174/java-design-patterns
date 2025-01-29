package behavioral.chainresponsibility.pattern;

/**
 * Demonstrates the Chain of Responsibility design pattern by chaining multiple support levels.
 */
public class Main {
    public static void main(String[] args) {

        // Create individual support handlers
        BasicSupport basic = new BasicSupport();
        AdvancedSupport advanced = new AdvancedSupport();
        ExpertSupport expert = new ExpertSupport();

        // Chain the handlers
        basic.setNext(advanced).setNext(expert);

        // Test handling different requests
        System.out.println("Handling 'basic' request:");
        basic.handle("basic");

        /*
        * Result:
        *
        * Handling 'basic' request:
        * Basic support: Solving basic problem
        * */

        System.out.println();
        System.out.println("Handling 'advanced' request:");
        basic.handle("advanced");

        /*
        * Result:
        *
        * Handling 'advanced' request:
        * You need advanced support
        * Advanced support: Solving advanced problem
        * */

        System.out.println();
        System.out.println("Handling 'expert' request:");
        basic.handle("expert");

        /*
        * Result:
        *
        * Handling 'expert' request:
        * You need advanced support
        * You need expert support
        * Expert support: Solving expert problem
        * */

        System.out.println();
        System.out.println("Handling 'other' request:");
        basic.handle("other");

        /*
        * Result:
        *
        * Handling 'other' request:
        * You need advanced support
        * You need expert support
        * We can't solve the problem!
        * */
    }
}
