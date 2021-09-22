package com.bridgelabz;
import java.util.Arrays;

public class MaximumGeneric<V extends Comparable<V>> {
    V[] elements;

    public MaximumGeneric(V[] elements) {
        this.elements = elements;
    }



    public static <V extends Comparable<V>> V maxValues(V[] elements) {
        Arrays.sort(elements);
        int lenght = elements.length;
        V max = elements[lenght - 1];
        System.out.printf("\nThe Maximum value in all of them is : %s ", max);
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Welcome To Generics");
        Float[] floatMax = { 1.4f, 87.3f, 81.8f, 40.2f, 4.6f };
        maxValues(floatMax);
        String[] stringMax = { "ABC", "IJK", "PQR", "BCD", "MNO", "LMN", "RST", "XYZ" };
        maxValues(stringMax);
    }
}