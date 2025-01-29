package behavioral.chainresponsibility.task;

public interface Approver {
    Approver setNext(Approver approver);
    void approveRequest(int amount);
}
