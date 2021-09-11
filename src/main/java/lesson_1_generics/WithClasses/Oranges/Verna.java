package lesson_1_generics.WithClasses.Oranges;

import lesson_1_generics.WithClasses.Orange;

public class Verna extends Orange {
    public static final String nameVariety = "VERNA";
    private final double totalPrice;

    public Verna(float weight, double unitPrice) {
        this.weight = weight;
        this.unitPrice = unitPrice;
        this.totalPrice = unitPrice * weight;
    }

    @Override
    public float getWeight() {
        return weight;
    }

    @Override
    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String getNameVariety() {
        return nameVariety;
    }

    @Override
    public double getUnitPrice() {
        return unitPrice;
    }

    @Override
    public String toString() {
        return "Verna{" +
                "nameVariety=" + nameVariety +
                ", unitPrice=" + unitPrice +
                ", weight=" + weight +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
