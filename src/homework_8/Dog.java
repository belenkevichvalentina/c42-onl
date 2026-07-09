package homework_8;


public class Dog extends Animal {
    private Dog() {
    }

    @Override
    public void voice() {
        System.out.println("ГАВ.");
    }

    @Override
    public void eat(String food) {
        if ("Grass".equals(food)) {
            System.out.println("Собака не ест " + food);
        } else if ("Meat".equals(food)) {
            System.out.println("Собака любит " + food);
        } else {
            System.out.println("Обычно собаке не дают " + food);
        }

    }

    public static Dog getDog() {
        return new Dog();
    }
}
