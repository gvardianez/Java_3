package lesson_1_generics;

import java.lang.reflect.Array;
import java.util.*;

public class Homework1 {

    public static void main(String[] args) {
        List<OrangeVarieties> varieties = List.of(OrangeVarieties.Moro);
        List<AppleVarieties> varieties1 = new ArrayList<>();
        varieties1.add(AppleVarieties.BlackPrince);
        varieties1.add(AppleVarieties.Gala);
        Box<Apple> box1 = new Box<>(200, varieties1);
        Box<Orange> box2 = new Box<>(200, varieties);
        Apple blackPrince = new Apple(3.5F, AppleVarieties.Gala);
        Apple gala = new Apple(5.5F, AppleVarieties.Gala);
        Apple golden = new Apple(12.6f, AppleVarieties.Golden);
        Orange moro = new Orange(6.6f,OrangeVarieties.Moro);
        box1.add(blackPrince);
        box2.add(moro);
        box1.add(gala);
        box1.add((golden));
    }

    public static <T> List<T> arrayToCollection(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

    public static <T> T[] collectionToArray(Class<T> tClass, Collection<T> collection) {
        T[] array = (T[]) Array.newInstance(tClass, collection.size());
        return collection.toArray(array);
    }

    public static <T> void swap(T[] array, int indexOne, int indexTwo) {
        T temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
    }

    public static <T> T[] swapAndNewArray(T[] array, int indexOne, int indexTwo) {
        T[] newArray = Arrays.copyOf(array, array.length);
        T temp = newArray[indexOne];
        newArray[indexOne] = newArray[indexTwo];
        newArray[indexTwo] = temp;
        return newArray;
    }

}
