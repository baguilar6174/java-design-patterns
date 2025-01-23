package structural.facade.task;

public class Memory {
    public void load(int position, String data) {
        System.out.println("Memory: Loading data from position " + position + " " + data + ".");
    }

    public void free() {
        System.out.println("Memory: Releasing memory");
    }
}
