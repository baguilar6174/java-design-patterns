package structural.facade.task;

public class HardDrive {
    public String read(int position, int size) {
        System.out.println("HardDrive: Reading " + size + " bytes from position " + position + ".");
        return "001011001010100";
    }

    public void close() {
        System.out.println("HardDrive: Stopping hard drive.");
    }
}
