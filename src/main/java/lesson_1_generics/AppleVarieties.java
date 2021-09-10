package lesson_1_generics;

public enum AppleVarieties implements VarietiesOfApple,Varieties {

    Golden(5.5),Gala(6.3),BlackPrince(11.7);

    private final double price;

    AppleVarieties(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
