package homework_9;

public class Accountant implements Position{
    @Override
    public void printPosition() {
        String position = "Accountant";
        System.out.println("Position - " + position);
    }
}
