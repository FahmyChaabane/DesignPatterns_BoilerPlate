package template_method;

public class GenerateReportTask extends Task {

    @Override
    protected void doExecute() {
        System.out.println("Launch Generate Report Task");   
    }
}

// should not do this
class OldGenerateReportTask {

    private AuditTrail auditTrail;

    public OldGenerateReportTask(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute() {
        auditTrail.record();
        System.out.println("Launch Generate Report Task");
        
    }
}