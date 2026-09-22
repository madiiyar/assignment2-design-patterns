package abstractfactory;

public class AdmissionPortal {
    private ApplicationForm form;
    private EntranceExam exam;

    // Фабрика передается через конструктор (композиция)
    public AdmissionPortal(UniversityFactory factory) {
        this.form = factory.createApplicationForm();
        this.exam = factory.createEntranceExam();
    }

    public void processAdmission() {
        System.out.println("--- Starting Admission Process ---");
        form.fillForm();
        exam.takeExam();
        System.out.println("----------------------------------\n");
    }
}