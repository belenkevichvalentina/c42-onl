package homework_9;

import homework_9.Task_1.*;
import homework_9.Task_2.*;

public class HomeworkMainInterfaces {
    /* Задача 1:
     Создать классы "Директор", "Рабочий", "Бухгалтер". Реализовать интерфейс с методом,
     который печатает название должности и имплементировать этот метод в созданные
     классы.
             Задача 2:
     Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг. Реализовать
     функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя
     абстрактный класс/методы). Создать массив из 5 разных фигур. Вывести на экран сумму
     периметра всех фигур в массиве.
             Задача *:
     Самостоятельно изучить и показать пример работы интерфейса-маркера Cloneable.*/
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("Homework 9 ");
        System.out.println("Task 1 : ");
        printPositions();
        System.out.println("-".repeat(90));
        System.out.println("Task 2 : ");
        calculateTotalPerimeter();
        System.out.println("-".repeat(90));
        System.out.println("Task * : ");
        createAndCloneCat();
    }

    public static void printPositions() {
        Position director = new Director();
        Position worker = new Worker();
        Position accountant = new Accountant();
        director.printPosition();
        worker.printPosition();
        accountant.printPosition();
    }


    public static void calculateTotalPerimeter() {
        Figure[] figures = new Figure[]{
                new Triangle(7, 6, 12),
                new Rectangle(8, 4),
                new Circle(5),
                new Rectangle(2, 6),
                new Circle(7),
        };
        double totalPerimeter = 0;
        for (int i = 0; i < figures.length; i++) {
            totalPerimeter += figures[i].calculatePerimeter();
            System.out.printf("Фигура : %s площадь - %.2f периметр - %.2f\n", figures[i].getFigure(),
                    figures[i].calculateArea(), figures[i].calculatePerimeter());
        }
        System.out.println("");
        System.out.printf("Сумма периметров всех фигур в массиве: %.2f\n", totalPerimeter);


    }

    public static void createAndCloneCat() throws CloneNotSupportedException {
        Cat originalCat = new Cat("Nika", "black", 4.5);
        Cat cloneCat = (Cat) originalCat.clone();
        System.out.println("--- До изменений ---");
        System.out.println("Оригинал: " + originalCat);
        System.out.println("Клон:     " + cloneCat);
        System.out.println("");
        cloneCat.setColorCat("ginger");
        cloneCat.setWeightCat(10.0);
        System.out.println("--- После изменений клона ---");
        System.out.println("Оригинал: " + originalCat);
        System.out.println("Клон:     " + cloneCat);
    }
}


