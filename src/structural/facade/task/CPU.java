package structural.facade.task;

public class CPU {

    public void stopOperations() {
        System.out.println("CPU: Stopping operations.");
    }

    public void jump(int position) {
        System.out.println("CPU: jump memory position " + position + ".");
    }

    public void execute() {
        System.out.println("CPU: Run instructions.");
    }
}
