package extraHomework_2;

public class TicTacToe {
    private final char[][] board;

    public TicTacToe() {
        this.board = new char[3][3];
        System.out.println("Создан TicTacToe объект внутри конструктора");
    }

    public void fillBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                this.board[i][j] = '-' ;
            }
        }
    }

    public void printBoard() {


        System.out.println("* 0 1 2 ");

        for (int i = 0; i < board.length; i++) {
            System.out.print(i  + " ");

            for (int j = 0; j < board[i].length; j++) {

                System.out.print(this.board[i][j]);
                System.out.print(' ');

            }
            System.out.println();



        }
    }
    public void selectTheTurnOrder() {
        double random = Math.random();
        if (random < 0.5 ){
            System.out.println("Ход искусственного интеллекта." + random);
        }else {
        System.out.println("Ход пользователя." + random);}
    }


    public char[][] getBoard() {
        return this.board;

    }
}
