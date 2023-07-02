package lesson7.clinic;

public class ClinicRunner {
    public static void main(String[] args) {
        Doctor surgeon = new Surgeon();
        Doctor therapist = new Therapist();
        Doctor dentist = new Dentist();
        Patient patient = new Patient();
        MedicalPlan medicalPlan = new MedicalPlan(1);
        patient.setMedicalPlan(medicalPlan);

    }
    public static void assignDoctor (int code) {
        switch (code) {
            case 1 -> {

            }
            case 2 -> {

            }
            case 3 -> {

            }
        }
    }
}
