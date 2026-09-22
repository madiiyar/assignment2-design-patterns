package factorymethod;

public abstract class ApplicationManager {

    // Фабричный метод (Factory Method)
    public abstract Application createApplication();

    // Бизнес-логика, использующая интерфейс
    public void handleSubmission() {
        System.out.println("Starting application workflow...");
        Application app = createApplication();
        app.process();
        System.out.println("Workflow completed.\n");
    }
}