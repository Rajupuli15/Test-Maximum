package com.bridgelabz;
import java.util.Arrays;
import java.util.Scanner;

public class MaximumParameters<V extends Comparable<V>> {

    V[] elements;

    public MaximumParameters(V[] elements) {
        this.elements = elements;
    }

     // Generic method to store values in array and return maximum value.
    // We can store any size parameter

     // @return max : Maximum of three values

    public static <V extends Comparable<V>> V maxValues(V[] elements) {
        Arrays.sort(elements);
        int lenght = elements.length;
        V max = elements[lenght - 1];
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Welcome To Generics \n");
        Float[] floatMax = { 29.4f, 45.3f, 22.8f, 11.2f, 45.6f };
        System.out.println("The maximum value between the three float is : " + maxValues(floatMax)+ "\n");
        String[] stringMax = { "XYZ", "LMN", "PQR", "BCD", "MNO", "DEF", "RST", };
        System.out.println("The maximum value between the three string is : " + maxValues(stringMax));
    }
}
