package homework_10;


public class HomeworkMainObj {

   /* Задача 1:
    Создать класс для описания пользователя системы. Переопределить в классе методы
    toString,hashcode и equals. Создать несколько экземпляров класса с одним и тем же
    значением полей и сравнить с помощью метода equals.
    Задача *:
    Создать программу для реализации поверхностного и глубокого клонирования объекта
    класса User. Пусть на вход программе будет передаваться тип операции клонирования
            (поверхностное клонирование или глубокое), а также id юзера для клонирования.*/

    public static void main(String[] args) throws CloneNotSupportedException{
        System.out.println("Homework 9 ");
        System.out.println("Task 1 : ");
        createAndCloneUser();
        System.out.println("-".repeat(90));


    }


    public static void createAndCloneUser() throws CloneNotSupportedException{
        User originalUser = new User(1,"admin","admin1!");
        User originalUser1 = new User(1,"admin","admin1!");

        System.out.println("Результат equals(): " + originalUser.equals(originalUser1));
        System.out.println("hashCode original user: " + originalUser.hashCode());
        System.out.println("hashCode original user 1: " + originalUser.hashCode());
        System.out.println("toString original user: \n" + originalUser.toString());
        System.out.println("toString original user 1 : \n" + originalUser1.toString());

    }
}
