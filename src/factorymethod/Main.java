package factorymethod;

public class Main {
    public static void main(String[] args) {
        ApplicationManager foundationPortal = new FoundationManager();
        foundationPortal.handleSubmission();

        ApplicationManager undergradPortal = new UndergraduateManager();
        undergradPortal.handleSubmission();

        ApplicationManager transferPortal = new TransferManager();
        transferPortal.handleSubmission();
    }
}