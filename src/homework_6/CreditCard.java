package homework_6;

public class CreditCard {
    /*Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте
    метод, который позволяет начислять сумму на кредитную карточку. Добавьте метод,
    который позволяет снимать с карточки некоторую сумму. Добавьте метод, который
    выводит текущую информацию о карточке. Напишите программу, которая создает три
    объекта класса CreditCard у которых заданы номер счета и начальная сумма.
    Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с
    третьей. Выведите на экран текущее состояние всех трех карточек.
    teachmeskills.by
   */

    public int accountNumber;
    public double amountOnTheAccount;

    public CreditCard(double amountOnTheAccount, int accountNumber) {
        this.amountOnTheAccount = amountOnTheAccount;
        this.accountNumber = accountNumber;
    }

    public void addSum(double amount) {
        amountOnTheAccount += amount;
    }

    public void withdrawAmount(double amount) {
        amountOnTheAccount -= amount;
    }

    public void getCreditCardInfo() {
        System.out.printf("\tНомер счета кредитной карты № " + accountNumber + ",сумма на на счете %.2f  $\n",
                amountOnTheAccount);
        System.out.println("-".repeat(90));
    }


}
