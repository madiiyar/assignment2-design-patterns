package factorymethod;

public class FoundationManager extends ApplicationManager {
    @Override
    public Application createApplication() {
        return new FoundationApplication();
    }
}