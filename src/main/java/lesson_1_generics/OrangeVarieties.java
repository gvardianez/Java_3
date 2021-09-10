package lesson_1_generics;

public enum OrangeVarieties implements VarietiesOfOrange, Varieties{

    Hamlin(9.7),Verna(8.8),Moro(15.4);

    private final double price;

    OrangeVarieties(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
