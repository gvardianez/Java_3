package lesson_1_generics;

public abstract class Fruit {

    protected double price;
    protected float weight;

    public abstract float getWeight();

    public abstract Enum<? extends Varieties> getVariety();

    public abstract double getPrice();

}
