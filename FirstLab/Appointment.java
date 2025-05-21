public class Appointment {
    private Doctor doctor;
    private Patient patient;
    private String appointmentDate;

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public String getAppointedDate() {
        return appointmentDate;
    }

    public void setDoctor(Doctor d) {
        doctor = d;
    }

    public void setPatient(Patient p) {
        patient = p;
    }

    public void setAppointmentDay(String d) {
        appointmentDate = d;
    }
}
