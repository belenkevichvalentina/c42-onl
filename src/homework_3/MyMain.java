package homework_3;
import java.util.Scanner;


public class MyMain {
    public static void main(String[] args) {
        //isEvenNumber();
        determineTemperature();
        //printSquaresNumbers();
        //showSequence();
       // sumUp();
    }

    public static void isEvenNumber() {
        Scanner num = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter a number: ");
            boolean hasNextInt = num.hasNextInt();
            if (hasNextInt) {
                int number = num.nextInt();
                System.out.println((number % 2 == 0) ? "Task 1: Even number " + number : "Task 1: Odd number " + number);
                break;
            } else {
                System.out.println("Enter any number. For example, '10'.");
                num.nextLine();
            }
        }
        num.close();
    }

    public static void determineTemperature() {
        Scanner temp = new Scanner(System.in);
        while (true) {
            System.out.println("Please indicate the outside temperature: ");
            boolean hasNextInt = temp.hasNextInt();

            if (hasNextInt) {

                int temptemperature = temp.nextInt();

                if (temptemperature > -5) {
                    System.out.println("Task 2: Warm.");
                } else if (temptemperature > -20) {
                    System.out.println("Task 2: Normal.");
                } else if ( temptemperature <= -20) {
                    System.out.println("Task 2: Cold.");
                }
                break;
            } else {
                System.out.println("Incorrect data entered. Please enter a number .");
                temp.nextLine();
            }
        }
        temp.close();
    }

     public static void printSquaresNumbers(){
         int squar;
         for (int num = 10; num <=20 ; num++) {
           squar = num * num;
             System.out.println(squar);
         }

     }
    public static void showSequence() {
        int sequence;
        sequence = 0;
        System.out.println("Task 4: Sequence");
        while (sequence < 98) {
            sequence += 7;
            System.out.println(sequence);
        }
    }

    public static void sumUp() {
        Scanner sum = new Scanner(System.in);
        while (true) {
            System.out.print("Enter number: ");

            boolean hasNaxtInt = sum.hasNextInt();

            if (hasNaxtInt) {
                int number = sum.nextInt();

                int totalSum = 0;
                if (number > 0) {

                    for (int i = 1; i <= number; i++) {
                        totalSum += i;
                    }
                    System.out.println("Task 5: The sum of all numbers " + totalSum);
                    break;
                } else {
                    System.out.println("Enter any positive number. For example, '10'.");
                    sum.nextLine();
                }
            }else {
                System.out.println("Enter any number. For example, '10'.");
                sum.nextLine();
            }

        }
        sum.close();

    }

}
