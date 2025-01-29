package behavioral.chainresponsibility.task;

public class Main {
    public static void main(String[] args) {
        Supervisor supervisor = new Supervisor();
        Manager manager = new Manager();
        Director director = new Director();
        supervisor.setNext(manager).setNext(director);
        supervisor.approveRequest(500);
        supervisor.approveRequest(3000);
        supervisor.approveRequest(7000);
    }
}
