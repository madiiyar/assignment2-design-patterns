package abstractfactory;

public class NazarbayevFactory implements UniversityFactory {
    @Override
    public ApplicationForm createApplicationForm() {
        return new NazarbayevForm();
    }

    @Override
    public EntranceExam createEntranceExam() {
        return new NazarbayevExam();
    }
}