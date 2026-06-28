package homework_7;

public class Surgeon extends Doctor {


    public Surgeon() {
//        super();
        System.out.println("Создан терапевт Surgeon");
    }
    @Override
    public void treat(){
        System.out.println("Провести операцию.");
    }
}
