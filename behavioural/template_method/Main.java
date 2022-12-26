package template_method;

public class Main {
    public static void main(String[] args) {
        Task task = new GenerateReportTask();
        // can see the doExecute() method cause main is in same package.
        task.execute(); 
    }
}
