package homework_11;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkString {
    /*1. Ввести 3 строки с консоли, найти самую короткую и самую длинную строки. Вывести
    найденные строки и их длину.
2. Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке возрастания
    значений их длины.
3. Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше
    средней, а также их длину.
4. Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов.
    Если таких слов несколько, найти первое из них.
5. Вывести на консоль новую строку, которой задублирована каждая буква из
    начальной строки. Например, "Hello" -> "HHeelllloo".
    Задача *:
    Дана строка произвольной длины с произвольными словами. Написать программу для
    проверки является ли любое выбранное слово в строке палиндромом.
            Например, есть строка, вводится число 3, значит необходимо проверить является ли 3-е
    слово в этой строке палиндромом.
    Предусмотреть предупреждающие сообщения на случаи ошибочных ситуаций: например,
    в строке 5 слов, а на вход программе передали число 500*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Homework 11 arrays");
        System.out.println("Task 1 : ");
        System.out.println("Введите 3 строки:");
        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();
        String string3 = scanner.nextLine();
        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
        getMinMax(string1, string2, string3);
        System.out.println("-".repeat(90));
        System.out.println("Task 2 : ");
        sortAscendingStrings(string1, string2, string3);
        System.out.println("-".repeat(90));
        System.out.println("Task 3 : ");
        getBelowAverage(string1, string2, string3);
        System.out.println("-".repeat(90));
        System.out.println("Task 4 : ");
        findUniqueWord(string1, string2, string3);
        System.out.println("-".repeat(90));
        System.out.println("Task 5 : ");
        System.out.println("Введите строку для дублирования.");
        String strDouble = scanner.nextLine();
        duplicateLetters(strDouble);
        System.out.println("-".repeat(90));
    }

    public static void getMinMax(String str1, String str2, String str3) {
        String min = str1;
        String max = str1;

        if (str2.length() < min.length()) {
            min = str2;

        } else if (str3.length() < min.length()) {
            min = str3;
        } else {
            min = str1;
        }
        System.out.println("Самая короткая строка: " + min + " длина строки - " + min.length());

        if (str2.length() > max.length()) {
            max = str2;
        } else if (str3.length() > max.length()) {
            max = str3;
        } else {
            max = str1;
        }
        System.out.println("Самая длинная  строка: " + max + " длина строки - " + max.length());
    }

    public static void sortAscendingStrings(String str1,String str2,String str3) {
        String[] array = {str1, str2, str3};
        String temp ;
        for (int i = 0; i < array.length; i++) {
            for (int j =  i + 1; j < array.length ; j++) {
                if (array[j].compareTo(array[i]) < 0) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void getBelowAverage(String str1, String str2, String str3) {
        double averageLength = (double) (str1.length() + str2.length() + str3.length()) / 3;
        System.out.printf("Средняя длина строк: %.2f \n",averageLength);
        System.out.println("Строки короче средней длины: \n");
        if (str1.length() < averageLength){
            System.out.println(str1 + " длина строки - " + str1.length());
        }
        if (str2.length() < averageLength){
            System.out.println(str2 + " длина строки - " + str2.length());
        }
        if (str3.length() < averageLength){
            System.out.println(str3 + " длина строки - " + str3.length());
        }

    }

    public static void findUniqueWord(String str1, String str2, String str3){
        String[] array = {str1, str2, str3};
        for (String word : array){
            if (isUniqueWord(word) && !word.isEmpty()){
                System.out.println("Первое слово из различных символов: " + word);
                return;
            }
        }
        System.out.println("Слово из различных символов не найдено");
    }
    public static boolean isUniqueWord(String word){
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (word.indexOf(letter) != word.lastIndexOf(letter)){
            return false;}
        }
        return true;
    }

    public static void duplicateLetters(String strD){
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < strD.length(); i++) {
            char letter = strD.charAt(i);
            builder.append(letter).append(letter);
        }
        System.out.println("Строка с дублированием - " + builder);
    }
}
