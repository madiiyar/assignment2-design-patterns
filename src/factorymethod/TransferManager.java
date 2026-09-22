package factorymethod;

public class TransferManager extends ApplicationManager {
    @Override
    public Application createApplication() {
        return new TransferApplication();
    }
}