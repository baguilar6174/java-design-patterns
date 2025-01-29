package behavioral.chainresponsibility.task;

public class Supervisor extends BaseApprover {
    @Override
    public void approveRequest(int amount) {
        if (amount <= 1000) {
            System.out.println("Sale with amount " + amount + " approved by supervisor!");
            return;
        }
        this.next(amount);
    }
}
