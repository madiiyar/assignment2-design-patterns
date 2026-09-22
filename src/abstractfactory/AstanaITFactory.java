package abstractfactory;

public class AstanaITFactory implements UniversityFactory {
    @Override
    public ApplicationForm createApplicationForm() {
        return new AstanaITForm();
    }

    @Override
    public EntranceExam createEntranceExam() {
        return new AstanaITExam();
    }
}