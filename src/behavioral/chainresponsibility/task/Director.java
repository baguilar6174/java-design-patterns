package behavioral.chainresponsibility.task;

public class Director extends BaseApprover {

    @Override
    public void approveRequest(int amount) {
        System.out.println("Sale with amount " + amount + " approved by director!");
    }
}
