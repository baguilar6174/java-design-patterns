package behavioral.chainresponsibility.task;

public abstract class BaseApprover implements Approver {

    private Approver nextApprover = null;

    @Override
    public Approver setNext(Approver approver) {
        this.nextApprover = approver;
        return approver;
    }

    public abstract void approveRequest(int amount);

    protected void next(int amount) {
        if (this.nextApprover != null) {
            this.nextApprover.approveRequest(amount);
            return;
        }
        System.out.println("Request can't approve!");
    }
}
