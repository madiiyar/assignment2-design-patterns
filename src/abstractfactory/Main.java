package abstractfactory;

public class Main {
    public static void main(String[] args) {
        // Создаем семейство для Nazarbayev University
        UniversityFactory nuFactory = new NazarbayevFactory();
        AdmissionPortal nuPortal = new AdmissionPortal(nuFactory);
        nuPortal.processAdmission();

        // Создаем семейство для Astana IT
        UniversityFactory aituFactory = new AstanaITFactory();
        AdmissionPortal aituPortal = new AdmissionPortal(aituFactory);
        aituPortal.processAdmission();
    }
}