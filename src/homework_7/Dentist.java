package homework_7;

public class Dentist extends Doctor {

    public Dentist() {

        System.out.println("Создан терапевт Dentist");
    }

    @Override
    public void treat() {
        System.out.println("Сверлить зуб.");
    }

}
