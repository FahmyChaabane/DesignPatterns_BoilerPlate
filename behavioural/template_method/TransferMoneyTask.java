package template_method;

public class TransferMoneyTask extends Task {

    @Override
    protected void doExecute() {
        System.out.println("Launch Tansfer Money Task");
    }    
}

// should not do this
class OldTransferMoneyTask {

    private AuditTrail auditTrail;

    public OldTransferMoneyTask(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute() {
        auditTrail.record();
        System.out.println("Launch Tansfer Money Task");
        
    }
}