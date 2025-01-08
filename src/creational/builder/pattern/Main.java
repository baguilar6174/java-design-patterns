package creational.builder.pattern;

public class Main {

    public static void main(String[] args) {
        Computer basic = new ComputerBuilder()
                .setCPU("Intel Core 2 DUO")
                .setRAM("4 GB")
                .setStorage("256 GB")
                .build();

        System.out.println("Basic Computer");
        basic.displayConfiguration();

        /*
        Result:

        Basic Computer
        CPU Intel Core 2 DUO, RAM: 4 GB, STORAGE: 256 GB, GPU: Not defined
        */
    }
}
