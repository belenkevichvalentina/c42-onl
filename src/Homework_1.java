public class Homework_1 {
    public static void main(String[] args) {
        calculateValue ();
        calculateSum();
        calculateSumNumber();
        printRealNumber();
        divideWithRemainder();
        replacePlaces();
    }
    public static void calculateValue() {
        // a=4*(b+c-1)/2

        int a;
        int b;
        int c;

        b = 22;
        c = 7;

        a=4*(b+c-1)/2;

        System.out.print("Task 1: ");
        System.out.println("Meaning of a = " + a );
    }
    public static void calculateSum() {
       int n;
       int m;
       int k;
       int sum;

       n = 36;
       m = n / 10;
       k = n % 10;
       sum = m+k;

       System.out.print("Task 2: ");
       System.out.println("Sum of a two-digit number = " + sum);
    }
    public static void calculateSumNumber() {
        int number;
        int threeNumber;
        int twoNumber;
        int oneNumber;
        int sumThree;

        number = 237;

        threeNumber = number / 100;
        twoNumber = (number - threeNumber * 100 ) / 10 ;
        oneNumber = number % 10;
        sumThree = threeNumber + twoNumber + oneNumber ;

        System.out.print("Task 3: ");
        System.out.println("Sum of a three-digit number = " + sumThree);
    }
    public static void printRealNumber() {
        double doubleVar;
        int intVar;

        doubleVar = 24.76;
        intVar = (int) doubleVar;
        System.out.print("Task 4: ");
        System.out.println("Rounded real number = " + intVar);
    }
    public static void divideWithRemainder() {
        int d;
        int c;
        int f;

        d = 21;
        c = 8;

        int result;
        result =  d / c;
        f = d % c;

        System.out.print("Task 5: ");
        System.out.println("Result of division with remainder = " + result + " and " + f + " in the remainder.");
        //double doubleResult = (float) d / c;
        //System.out.printf("Result of division with remainder = %.1f ", doubleResult);
    }
    public static void replacePlaces() {
        int xVelueOne;
        int yVelueTwo;
        int velueTemporaryStorage;

        xVelueOne = 1;
        yVelueTwo = 2;

        velueTemporaryStorage = xVelueOne;
        xVelueOne = yVelueTwo;
        yVelueTwo = velueTemporaryStorage;

        System.out.print("Task 6: ");
        System.out.println("Value x = " + xVelueOne + " Value y = " + yVelueTwo);

    }
}
