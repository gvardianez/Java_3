package lesson_1_generics;

public class Orange extends Fruit{

    private final Enum<? extends VarietiesOfOrange> variety;

    public <T extends Enum<T> & VarietiesOfOrange> Orange(float weight,T variety) {
        this.weight = weight;
        this.variety = variety;
        price = variety.getPrice() * weight;
    }

    @Override
    public float getWeight() {
        return weight;
    }

    @Override
    public Enum<? extends VarietiesOfOrange> getVariety() {
        return variety;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "weight=" + weight +
                '}';
    }
}
