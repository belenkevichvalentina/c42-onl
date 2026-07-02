package extraHomework_2;

public class TicTacToe {
    private char[][] board;

    public TicTacToe(char[][] board) {
        this.board = board;

        System.out.println("Создан TicTacToe объект внутри конструктора");
    }

    public void createTicTacToeBoard() {

        System.out.println("Вызван метод createTicTacToeBoard. Количество строк: " + board.length);
        System.out.println("-".repeat(90));
    }
}
