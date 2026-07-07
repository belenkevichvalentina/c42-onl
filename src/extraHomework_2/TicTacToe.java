package extraHomework_2;


import java.util.Scanner;

public class TicTacToe {
    private final char[][] board;
    private final char X_Letter = 'X';
    private final char O_Letter = 'O';
    private boolean isNotFull;
    private String turn;
    private String winner;
    Scanner scanner = new Scanner(System.in);

    public TicTacToe() {
        this.board = new char[3][3];
        System.out.println("Создан TicTacToe объект внутри конструктора");
    }

    public void fillBoard() {
        isNotFull = true;
        winner = "Ничья";
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                this.board[i][j] = '-';
//                this.board[i][j] = X_Letter;
            }
        }
    }

    public void printBoard() {
        System.out.print("* ");
        for (int c = 0; c < board.length; c++) {
            System.out.print(c + " ");

        }
        System.out.println();
        //   System.out.println("* 0 1 2 ");

        for (int i = 0; i < board.length; i++) {
            System.out.print(i + " ");

            for (int j = 0; j < board[i].length; j++) {

                System.out.print(this.board[i][j]);
                System.out.print(' ');

            }
            System.out.println();


        }
    }

    public String getRandom() {
        double random = Math.random();
        String pleaer = "человек";
        String pleaerAI = "искусственный интеллект";

//        if (random < 0.5) {
//
//            System.out.println("Ход искусственного интеллекта.");
//            return pleaerAI;
//
//        }
//
//        System.out.println("Ход пользователя.");
//        return pleaer;

        String result = random < 0.5 ? pleaerAI : pleaer;
        return result;
    }

    public void pleaGame() {
        AI ai = new AI();
        People people = new People();
        boolean continueGame = true;
        while (continueGame) {
            fillBoard();
            printBoard();
            String plearFirst = getRandom();
            String secondPlayer;
            if (plearFirst.equals("искусственный интеллект")) {
                ai.setLetter(X_Letter);
                this.turn = "Ai";
                secondPlayer = "Человек";
            } else {
                ai.setLetter(O_Letter);
                this.turn = "Человек";
                secondPlayer = "искусственный интеллект";
            }

            if (plearFirst.equals("человек")) {
                people.setLetter(X_Letter);
            } else {
                people.setLetter(O_Letter);
            }
            System.out.println("Первым ходит " + plearFirst + " и ставит "
                    + (plearFirst.equals("искусственный интеллект") ? ai.getLetter() : people.getLetter()));

            while (isNotFull) {
                if (this.turn.equals("Ai")) {
                    aiTurn(ai);
                    this.turn = "Человек";
                } else {
                    peopleTurne(people);
                    this.turn = "Ai";
                }
                isNotFull = chekFild();
                printBoard();
                System.out.println("++++++++++++++++++++++");
                determineTheWiner(plearFirst, secondPlayer);
            }
            System.out.println(winner);
            System.out.println("Сыграем еще Y - да N - нет");
            scanner.nextLine();
            String decision = scanner.nextLine();

            if (decision.equals("N")) {
                continueGame = false;
            }
        }
        scanner.close();
    }

    public void aiTurn(AI ai) {
        ai.makeAITurn();
        int i = ai.getiAI();
        int j = ai.getjAI();

        while (this.board[i][j] == X_Letter || this.board[i][j] == O_Letter) {
            ai.makeAITurn();
            i = ai.getiAI();
            j = ai.getjAI();
        }
        this.board[i][j] = ai.getLetter();
    }

    public void peopleTurne(People people) {
        int ip;
        int jp;
        while (true) {
            System.out.println("Введи Х");
            people.setiPeople(scanner.nextInt());
           people.setjPeople(scanner.nextInt());

            ip = people.getiPeople();
            if (ip == 0 || ip == 1 || ip == 2) {
                break;
            }
            System.out.println("Неверное число. Введите число 0, 1 или 2.");
        }
        while (true) {
            System.out.println("Введи У");
            people.setjPeople(scanner.nextInt());
            jp = people.getjPeople();
            if (jp == 0 || jp == 1 || jp == 2) {
                break;
            }
            System.out.println("Неверное число. Введите число 0, 1 или 2.");
        }

        while (this.board[ip][jp] == X_Letter || this.board[ip][jp] == O_Letter) {
            System.out.println("Поле занято введите новое");
            while (true) {
                System.out.println("Введи Х");
                people.setiPeople(scanner.nextInt());

           people.setjPeople(scanner.nextInt());
                ip = people.getiPeople();
                if (ip == 0 || ip == 1 || ip == 2) {
                    break;
                }
                System.out.println("Неверное число. Введите число 0, 1 или 2.");
            }
            while (true){
            System.out.println("Введи У");
            people.setjPeople(scanner.nextInt());
            jp = people.getjPeople();
            if (jp == 0 || jp == 1 || jp == 2) {
                break;
            }
            System.out.println("Неверное число. Введите число 0, 1 или 2.");
        }
        }
        this.board[ip][jp] = people.getLetter();
    }


    public boolean chekFild() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (this.board[i][j] == '-') {
                    return true;
                }
            }

        }
        return false;
    }

    public void determineTheWiner(String playerWithFirstTurn, String secondPlayer) {

        for (int i = 0; i < 3; i++) {
            if (this.board[i][0] != '-' && this.board[i][0] == this.board[i][1] && this.board[i][1] == this.board[i][2]) {
                isNotFull = false;

                char leaterArray = this.board[i][0];
                if (leaterArray == X_Letter) {
                    winner = "победа " + playerWithFirstTurn;
                } else if (leaterArray == O_Letter) {
                    winner = "победа " + secondPlayer;
                }

                return;

            }
            if (this.board[0][i] != '-' && this.board[0][i] == this.board[1][i] && this.board[1][i] == this.board[2][i]) {
                isNotFull = false;
                char leaterArray = this.board[0][i];
                if (leaterArray == X_Letter) {
                    winner = "победа " + playerWithFirstTurn;
                } else if (leaterArray == O_Letter) {
                    winner = "победа " + secondPlayer;
                }
                return;
            }

        }

        if (this.board[0][0] != '-' && this.board[0][0] == this.board[1][1] && this.board[0][0] == this.board[2][2]) {
            char leaterArray = this.board[0][0];
            if (leaterArray == X_Letter) {
                winner = "победа " + playerWithFirstTurn;
            } else if (leaterArray == O_Letter) {
                winner = "победа " + secondPlayer;
            }
            isNotFull = false;
        }
        if (this.board[0][2] != '-' && this.board[0][2] == this.board[1][1] && this.board[1][1] == this.board[2][0]) {
            char leaterArray = this.board[0][2];
            if (leaterArray == X_Letter) {
                winner = "победа " + playerWithFirstTurn;
            } else if (leaterArray == O_Letter) {
                winner = "победа " + secondPlayer;
            }
            isNotFull = false;
        }
    }

    public char[][] getBoard() {
        return this.board;

    }
}
