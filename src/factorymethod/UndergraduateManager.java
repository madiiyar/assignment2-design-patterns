package factorymethod;

public class UndergraduateManager extends ApplicationManager {
    @Override
    public Application createApplication() {
        return new UndergraduateApplication();
    }
}