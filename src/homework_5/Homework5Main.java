package homework_5;

import java.util.Arrays;
import java.util.Scanner;

public class Homework5Main {
    public static void main(String[] args) {

//        Задача *:
//        Даны числа n и m. Создайте массив A[n][m] и заполните его змейкой (см. пример).
//                Формат входных данных:
//        Программа получает на вход два числа n и m.
//                Формат выходных данных:
//        Программа должна вывести полученный массив, отводя на вывод каждого числа ровно 3
//        символа.
        System.out.println("Homework 4 arrays");
        System.out.println("Task 1 : ");
        sumAllElements();
        System.out.println("-".repeat(90));
        System.out.println("Task 2 : ");
        getChessboard();
        System.out.println("-".repeat(90));
    }

    public static void sumAllElements() {
        int row = 5;
        int column = 3;
        int sum = 0;
        int[][] tableOriginal = new int[row][column];

        for (row = 0; row < tableOriginal.length; row++) {
            for (column = 0; column < tableOriginal[row].length; column++) {
                tableOriginal[row][column] = (int) (Math.random() * 100);
            }
        }
        System.out.println("Task 1.1 : ");
        System.out.println("Двумерный массив, заполненный случайными числами.\n" +
                Arrays.deepToString(tableOriginal));

        System.out.println("Task 1.2 : ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для увелечения массива.");
        int scanNum = scanner.nextInt();
        for (int line = 0; line < tableOriginal.length; line++) {
            for (int val = 0; val < tableOriginal[line].length; val++) {
                tableOriginal[line][val] = tableOriginal[line][val] + scanNum;
                sum += tableOriginal[line][val];
            }
        }
        scanner.close();

        System.out.println("Увеличенный массив: \n" + Arrays.deepToString(tableOriginal));

        System.out.println("Task 1.3 : ");
        System.out.println("Сумма всех  элементов: " + sum);
    }

    public static void getChessboard() {
        String[][] chessboard = new String[8][8];
        for (int row = 0; row < chessboard.length; row++) {
            for (int column = 0; column < chessboard[0].length; column++) {

                if (row % 2 == 0 && column % 2 == 0) {
                    chessboard[row][column] = "W";
                } else if (row % 2 != 0 && column % 2 == 0) {
                    chessboard[row][column] = "B";
                } else if (row % 2 == 0) {
                    chessboard[row][column] = "B";
                } else {
                    chessboard[row][column] = "W";
                }

            }
        }

        for (int row = 0; row < chessboard.length; row++) {
            for (int column = 0; column < chessboard[0].length; column++) {
                System.out.print(chessboard[row][column] + " ");
            }
            System.out.println(" ");
        }

    }

}

