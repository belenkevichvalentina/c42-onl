package homework_9;

public class Cat implements Cloneable {
    private final String nameCat;
    private String colorCat;
    private double weightCat;

    public Cat(String nameCat, String colorCat, double weightCat) {
        this.nameCat = nameCat;
        this.colorCat = colorCat;
        this.weightCat = weightCat;
    }

    public void setColorCat(String colorCat) {
        this.colorCat = colorCat;
    }

    public void setWeightCat(double weightCat) {
        this.weightCat = weightCat;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Name cat " + this.nameCat +
                " \n Color  " + this.colorCat +
                " \n Weight  " + this.weightCat;

    }


}
