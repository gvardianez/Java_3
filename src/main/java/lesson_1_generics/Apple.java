package lesson_1_generics;

public class Apple extends Fruit {

    private final Enum<? extends VarietiesOfApple> variety;

    public <T extends Enum<T> & VarietiesOfApple> Apple(float weight, T variety) {
        this.weight = weight;
        this.variety = variety;
        price = variety.getPrice() * weight;
    }

    @Override
    public Enum<? extends VarietiesOfApple> getVariety() {
        return variety;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "variety=" + variety +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }
}
