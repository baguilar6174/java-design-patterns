package behavioral.chainresponsibility.task;

public class Manager extends BaseApprover {
    @Override
    public void approveRequest(int amount) {
        if (amount <= 5000) {
            System.out.println("Sale with amount " + amount + " approved by manager!");
            return;
        }
        this.next(amount);
    }
}
