package homework_8;

public class Rabbit extends Animal {

    @Override
    public void eat(String food) {
        if ("Grass".equals(food)){
            System.out.println("Кролик любит  " + food);
        } else if ("Meat".equals(food)) {
            System.out.println("Кролик не любит " + food);
        }else {
            System.out.println("Обычно кролику не дают " + food);
        }
    }

    @Override
    public void voice() {
        System.out.println("Громко пищит");
    }
}
