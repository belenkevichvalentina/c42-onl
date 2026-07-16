package homework_6;

public class HomeworkMainCreditCard {
    /*Задача 1:
    Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте
    метод, который позволяет начислять сумму на кредитную карточку. Добавьте метод,
    который позволяет снимать с карточки некоторую сумму. Добавьте метод, который
    выводит текущую информацию о карточке. Напишите программу, которая создает три
    объекта класса CreditCard у которых заданы номер счета и начальная сумма.
    Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с
    третьей. Выведите на экран текущее состояние всех трех карточек.
    teachmeskills.by
    Задача *:
    Создать класс, описывающий банкомат. Набор купюр, находящихся в банкомате, должен
    задаваться тремя свойствами: количеством купюр номиналом 20, 50 и 100. Сделать
    метод для добавления денег в банкомат. Сделать функцию, снимающую деньги, которая
    принимает сумму денег, а возвращает булевое значение - успешность выполнения
    операции. При снятии денег, функция должна распечатывать каким количеством купюр
    какого номинала выдаётся сумма. Создать конструктор с тремя параметрами -
    количеством купюр каждого номинала*/

    public static void main(String[] args) {
        System.out.println("Homework 6 ");
        System.out.println("Task 1 : ");
        createCreditCard();
        System.out.println("-".repeat(90));
        System.out.println("Task * : ");
        createATM();

    }

    public static void createCreditCard() {
        CreditCard card1 = new CreditCard(10_000, 111);
        CreditCard card2 = new CreditCard(10_000, 211);
        CreditCard card3 = new CreditCard(10_000, 311);
        card1.addSum(200);
        card2.addSum(3000);
        card3.withdrawAmount(13000.31);
        card1.getCreditCardInfo();
        card2.getCreditCardInfo();
        card3.getCreditCardInfo();
    }

    public static void createATM() {
        ATM bankAccount = new ATM(10, 6, 5);
        bankAccount.addSum(1, 1, 1);
        boolean drawOut = bankAccount.minusAmount(560);
        System.out.println(bankAccount.totalSum);
        System.out.println(drawOut);
    }


}
