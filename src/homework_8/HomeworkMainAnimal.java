package homework_8;

public class HomeworkMainAnimal {
    /*Задача 1:
    Создать логически верную иерархию следующих классов: Animal, Dog, Tiger, Rabbit.
    Переопределить методы voice(), eat(String food) чтобы они выводили верную
    информацию. Метод eat может принимать “Meat”, “Grass” и другие строки.
            Например, если мы создадим объект класса Rabbit, вызовем метод eat() и передадим
    туда “Grass” он должен написать в консоли что любит есть травку. Если передадим “Meat”
    или другую строку то он будет недоволен.
            Задача *:
    Написать такой конструктор, который запретит создание объекта класса Dog в других
    классах; Найти способ вызывать методы voice(), eat() класса Dog, который позволит
    обойти ограничение, наложенное конструктором выше. Объяснить, как работают оба
    способа*/
    public static void main(String[] args) {
        System.out.println("Homework 8 ");
        System.out.println("Task 1 : ");
        getAnimalInfo();
        System.out.println("-".repeat(90));
    }

    public static void getAnimalInfo(){

        Animal animal = new Animal();
        animal.eat("Grass");
        animal.voice();
        System.out.println();

        Animal dog = Dog.getDog();
        dog.voice();
        dog.eat("Grass");
        System.out.println();

        Animal tiger = new Tiger();
        tiger.voice();
        tiger.eat("Meat");
        System.out.println();

        Animal rabbit = new Rabbit();
        rabbit.voice();
        rabbit.eat("Grass");
    }
}
