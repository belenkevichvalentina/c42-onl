package homework_8;

public class Tiger extends Animal{

    @Override
    public void voice() {
        super.voice();
    }

    @Override
    public void eat(String food) {
        if ("Grass".equals(food)){
            System.out.println("Тигр не ест " + food);
        } else if ("Meat".equals(food)) {
            System.out.println("Тигр любит " + food);
        }else {
            System.out.println("Обычно тигру не дают " + food);
        }
    }
}
