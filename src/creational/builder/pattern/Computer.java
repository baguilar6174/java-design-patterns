package creational.builder.pattern;

/**
 * ----------
 * Step 1
 * ----------
 */
public class Computer {
    public String cpu = "Not defined";
    public String ram = "Not defined";
    public String storage = "Not defined";
    public String gpu = "Not defined";

    public void displayConfiguration() {
        System.out.printf("CPU %s, RAM: %s, STORAGE: %s, GPU: %s", this.cpu, this.ram, this.storage, this.gpu);
    }
}
