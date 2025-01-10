package creational.builder.pattern;

/**
 * ----------
 * Step 2
 * ----------
 * A builder class for constructing instances of the {@link Computer} class.
 * This class follows the Builder Design Pattern to allow flexible and readable object creation.
 */
public class ComputerBuilder {
    // Instance of the Computer being built.
    private final Computer computer;

    /**
     * Initializes a new builder for the Computer class.
     * This constructor creates a new empty instance of the Computer class.
     */
    public ComputerBuilder() {
        this.computer = new Computer();
    }

    /**
     * Sets the CPU for the Computer.
     *
     * @param cpu the CPU specification.
     * @return the current instance of {@code ComputerBuilder}.
     */
    public ComputerBuilder setCPU(String cpu) {
        this.computer.cpu = cpu; // Set the CPU property of the Computer instance.
        return  this;   // Returns the current instance of `ComputerBuilder`.
    }

    /**
     * Sets the RAM for the Computer.
     *
     * @param ram the RAM specification.
     * @return the current instance of {@code ComputerBuilder}.
     */
    public ComputerBuilder setRAM(String ram) {
        this.computer.ram = ram;
        return this;
    }

    /**
     * Sets the storage for the Computer.
     *
     * @param storage the storage specification.
     * @return the current instance of {@code ComputerBuilder} for method chaining.
     */
    public ComputerBuilder setStorage(String storage) {
        this.computer.storage = storage;
        return this;
    }

    /**
     * Sets the GPU of the Computer object.
     *
     * @param gpu model to set.
     * @return the current ComputerBuilder instance.
     */
    public ComputerBuilder setGPU(String gpu) {
        this.computer.gpu = gpu;
        return this;
    }

    /**
     * Finalizes the build process and returns the fully constructed {@link Computer} object.
     *
     * @return the constructed {@link Computer} object.
     */
    public Computer build() {
        return this.computer; // Return the fully built Computer instance.
    }
}
