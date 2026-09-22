package factorymethod;

public class TransferApplication implements Application {
    @Override
    public void process() {
        System.out.println("Processing Transfer application: Validating credit differences and executing transfer to SDU University.");
    }
}