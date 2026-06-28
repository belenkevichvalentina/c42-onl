package homework_7;

public class Patient  {
   /* класс «Пациент» с полем «План лечения» и полем
    «Доктор». Создать объект класса «Пациент» и добавить пациенту план лечения.

    */
   private int treatmentCode;
   private Doctor doctor;

   public Patient(int treatmentCode){
       this.treatmentCode = treatmentCode;
       System.out.println("Пациент создан с кодом: " + treatmentCode);
   }

    public int getTreatmentCode() {
        return treatmentCode;
    }
    public void setDoctor(Doctor doctor){
       this.doctor = doctor;
    }
    public Doctor getDoctor() {
       return doctor;
    }
}
