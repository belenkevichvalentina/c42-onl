package homework_6;

public class ATM {
    /*Задача *:
    Создать класс, описывающий банкомат. Набор купюр, находящихся в банкомате, должен
    задаваться тремя свойствами: количеством купюр номиналом 20, 50 и 100. Сделать
    метод для добавления денег в банкомат. Сделать функцию, снимающую деньги, которая
    принимает сумму денег, а возвращает булевое значение - успешность выполнения
    операции. При снятии денег, функция должна распечатывать каким количеством купюр
    какого номинала выдаётся сумма. Создать конструктор с тремя параметрами -
    количеством купюр каждого номинала*/

    public int denomination20;
    public int denomination50;
    public int denomination100;


    public int totalSum;


    public ATM(int denomination20, int denomination50, int denomination100) {
        this.denomination20 = denomination20;
        this.denomination50 = denomination50;
        this.denomination100 = denomination100;
        this.totalSum = (denomination20 * 20) + (denomination50 * 50) + (denomination100 * 100);

    }

    public void addSum(int denomination20, int denomination50, int denomination100) {
        totalSum = totalSum + (denomination20 * 20) + (denomination50 * 50) + (denomination100 * 100);
    }


    public boolean minusAmount(int sum) {
        int remaining = sum;
        int take100 = 0;
        int take50 = 0;
        int take20 = 0;

        if (remaining > totalSum) {

            System.out.println("Запрошенная сумма недоступна. В наличии есть - " + totalSum);
            return false;
        }

        if (remaining >= denomination100) {
            take100 = remaining / 100;
            if (take100 > denomination100) {
                take100 = denomination100;
            }
            remaining -= take100 * 100;
        }

        if (remaining >= denomination50) {
            take50 = remaining / 50;
            if (take50 > denomination50) {
                take50 = denomination50;
            }
            remaining -= take50 * 50;
        }

        if (remaining >= denomination20) {
            take20 = remaining / 20;
            if (take20 > denomination20) {
                take20 = denomination20;
            }
            remaining -= take20 * 20;
        }


        System.out.println("Remaining " + remaining);
        if (remaining > 0) {
            System.out.println("В банкомате отсутствуют купюры нужного номинала " + remaining
                    + ". Пожалуйста, введите другую сумму.");
            return false;
        }
        System.out.println("Были выданы купюры следующим номиналом:\n100 $ " + take100 +
                "\n 50 $ " + take50 + " \n 20 $ " + take20);
        return true;

    }


}
