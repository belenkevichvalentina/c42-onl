package homework_12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeworkRegex {
    /*Задача 1:
    Вывести в консоль из строки которую пользователь вводит с клавиатуры все
    аббревиатуры. Аббревиатурой будем считать слово от 2 до 6 символов, состоящее
    только из прописных букв, без чисел.
            Задача *:
    Программа на вход получает произвольный текст. В этом тексте может быть номер
    документа(один или несколько), емейл и номер телефона. Номер документа в формате:
    xxxx-xxxx-xx, где x - это любая цифра; номер телефона в формате: +(xx)xxxxxxx. Документ
    может содержать не всю информацию, т.е. например, может не содержать номер
    телефона, или другое. Необходимо найти эту информацию и вывести в консоль в
    формате:
    email: teachmeskills@gmail.com
    document number: 1423-1512-51
    и т.д*/

    public static void main(String[] args) {
        DataExtractor extractor = new DataExtractor();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Homework 12 arrays");
        System.out.println("Task 1 : ");
        System.out.println("Введите строку для поиска аббревиатур: ");
        String userText = scanner.nextLine();
        extractor.findAbbreviation(userText);
        System.out.println("-".repeat(90));
        System.out.println("Task * : ");
        System.out.println("Введите текст для поиска данных: номер \n\t" +
                "    документа(xxxx-xxxx-xx), емейл и номер телефона (+(xx)xxxxxxx).\n\t" +
                "* x - цифра");
        String userData = scanner.nextLine();
        extractor.parsingData(userData);
        scanner.close();
    }



}
