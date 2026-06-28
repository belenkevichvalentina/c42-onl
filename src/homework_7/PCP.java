package homework_7;

public class PCP extends Doctor{

    public PCP() {

        System.out.println("Создан терапевт PCP");
    }

    @Override
    public void treat(){
        System.out.println("Измерить давление.");
    }


    /*терапевта создать метод, который будет назначать врача пациенту согласно плану
        лечения:
        Если план лечения имеет код 1 – назначить хирурга и выполнить метод лечить.
        Если план лечения имеет код 2 – назначить дантиста и выполнить метод лечить.
        Если план лечения имеет любой другой код – назначить терапевта и выполнить метод
        лечить.*/
    public void assignDoctor(Patient patient) {
        System.out.println("Назначаем врача пациенту");
        int code = patient.getTreatmentCode();
        if (code == 1) {
            Doctor doctor = new Surgeon();
            patient.setDoctor(doctor);
        }
        if (code == 2) {
            Doctor doctor = new Dentist();
            patient.setDoctor(doctor);
        }
        if (code != 1 && code !=2){
            Doctor doctor = new PCP();
            patient.setDoctor(doctor);
        }
        Doctor doctor = patient.getDoctor();
        System.out.println("Счас полечим");
        doctor.treat();
    }

}