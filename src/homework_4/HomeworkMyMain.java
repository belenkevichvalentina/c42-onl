package homework_4;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkMyMain {
    public static void main(String[] args) {
        int lengthArray;
        int random;
        Scanner numberEnter = new Scanner(System.in);

        while (true) {
            System.out.println("Введите длину массива: ");
            if (numberEnter.hasNextInt()) {
                lengthArray = numberEnter.nextInt();

                numberEnter.nextLine();
                if (lengthArray > 0) {

                    System.out.println("Введена длинна массива: " + lengthArray);
                    break;
                } else {
                    System.out.println("Число должно быть больше 0, просто целое.");
                }
            } else {
                System.out.println("Вы ввели не число.");
                numberEnter.nextLine();
            }


        }
        int[] arrayManualInput = new int[lengthArray];
        int index = 0;
        while (arrayManualInput.length != index) {
            System.out.println("Введите число № " + (index + 1) + " массива.");
            if (numberEnter.hasNextInt()) {
                int number = numberEnter.nextInt();
                if (number >= 0) {
                    arrayManualInput[index] = number;
                    index++;
                } else {
                    System.out.println("Число отрицательное. Ведите положительное");
                }
                numberEnter.nextLine();
            } else {
                System.out.println("Вы ввели не число.");
                numberEnter.nextLine();
            }
        }
        System.out.println("Введен массив: " + Arrays.toString(arrayManualInput));

        numberEnter.close();


        int[] array = new int[lengthArray];
        for (int counter = 0; counter < array.length; counter++) {
            random = (int) (Math.random() * 100);
            array[counter] = random;
        }

        // Конец инициализации массивов

        System.out.println("Homework 3 arrays");
        System.out.println("Task 0.1 : ");
        getLengthOfArray(arrayManualInput, array);
        System.out.println("-".repeat(90));

        System.out.println("Task 1 : ");
        showElements(array);
        System.out.println("-".repeat(90));

        System.out.println("Task 2 : ");
        getMinMaxElements(array);
        System.out.println("-".repeat(90));

        System.out.println("Task 3 : ");
        getIndexMinMax(array);
        System.out.println("-".repeat(90));

        System.out.println("Task 4 : ");
        getZeroElements(array);
        System.out.println("-".repeat(90));

        System.out.println("Task 5 : ");
        getReverseArray(array);
        System.out.println("-".repeat(90));

        System.out.println("Task 6 : ");
//        determineIncreasingSequence();
        determineIncreasingSequenceSecondVariant(arrayManualInput);
        System.out.println("-".repeat(90));

        //Задача *:
        //Имеется массив из неотрицательных чисел(любой). Представьте что массив
        //представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} -> 999). Задача
        //добавить единицу к этому “числу” и на выходе получить исправленный массив. Массив не
        //содержит нуля в начале, кроме самого числа 0.
        //Пример:
        //Input: [1,4,0,5,6,3]
        //Output: [1,4,0,5,6,4]
        //Input: [9,9,9]
        //Output: [1,0,0,0]
    }


    public static void getLengthOfArray(int[] array, int[] arrayManualInput) {
        System.out.println(Arrays.toString(array));
        System.out.println("Длинна рандом массива: " + array.length);

        System.out.println(Arrays.toString(arrayManualInput));
        System.out.println("Длинна массива с ручным вводом  массива: " + arrayManualInput.length);
    }

    public static void showElements(int[] array) {
        System.out.println("Все элементы массива в прямом порядке: ");
        for (int counter = 0; counter < array.length; counter++) {
            System.out.println("Индекс [" + counter + "] - " + "значение " + array[counter]);
        }
        System.out.println("=".repeat(90));
        System.out.println("Все элементы массива в обратном порядке: ");
        for (int counter = array.length - 1; counter >= 0; counter--) {

            System.out.println("Индекс [" + counter + "] - " + "значение " + array[counter]);

        }

    }

    public static void getMinMaxElements(int[] array) {
        int minValue = array[0];
        int maxValue = array[0];
        for (int counter = 0; counter < array.length; counter++) {

            if (array[counter] < minValue) {
                minValue = array[counter];
            }
            if (array[counter] > maxValue) {
                maxValue = array[counter];
            }
        }

        System.out.println("Все элементы массива в прямом порядке: " + Arrays.toString(array));
        System.out.println("Минимальное значение в массиве min " + minValue
                + " ,максимальный значение в массиве max " + maxValue + ".");

    }

    public static void getIndexMinMax(int[] array) {

        int minValue = array[0];
        int maxValue = array[0];
        int counterMin = 0;
        int counterMax = 0;
        System.out.println(Arrays.toString(array));
        for (int counnter = 0; counnter < array.length; counnter++) {

            if (array[counnter] < minValue) {
                minValue = array[counnter];
                counterMin = counnter;
            }
            if (array[counnter] > maxValue) {
                maxValue = array[counnter];
                counterMax = counnter;
            }
        }

        System.out.println("Индекс минимального значения в массиве min  " + counterMin +
                " индекс максимального значения в массиве  max " + counterMax);
    }

    public static void getZeroElements(int[] array) {
        int zero = 0;
        for (int counnter = 0; counnter < array.length; counnter++) {
            if (array[counnter] == 0) {
                zero += 1;
            }
        }
        if (zero == 0) {
            System.out.println("Нулевых элементов - " + zero);
        } else {
            System.out.println("Нулевых элементов - " + zero);
        }


    }

    public static void getReverseArray(int[] array) {
        int[] arrayReverse = new int[array.length];
        System.out.println(Arrays.toString(array));
        for (int counter = 0; counter < array.length; counter++) {
            arrayReverse[counter] = array[array.length - 1 - counter];
        }

        System.out.println(Arrays.toString(arrayReverse));
    }

    public static void determineIncreasingSequence() {
        int[] arrayZero = {1, 2, 13, 4, 8, 9};
        int increase = 0;
        int counter;
        for (counter = 0; counter < arrayZero.length; counter++) {
            if (increase < arrayZero[counter]) {
                increase = arrayZero[counter];

            } else if (increase > arrayZero[counter]) {
                break;
            }
        }

        if (counter == arrayZero.length) {
            System.out.println("Массив является возрастающей последовательностью. " + increase);
        } else {
            System.out.println("Массив не является возрастающей последовательностью. " + increase);
        }
    }

    public static void determineIncreasingSequenceSecondVariant(int[] array) {
        boolean flag = true;
        for (int counter = 0; counter < array.length - 1; counter++) {
            if (array[counter] >= array[counter + 1]) {
                flag = false;
                System.out.println("Не последовательно");
                break;
            }
        }
        if (flag) {
            System.out.println("Последовательно");
        }
    }

}






