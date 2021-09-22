package com.bridgelabz;

public class MaximumStrings {
    public static Integer maxInteger(Integer x, Integer y, Integer z){
        Integer max = x;
        if(y.compareTo(max) > 0)
            max = y;

        if(z.compareTo(max) > 0)
            max = z;

        return max;
    }
 // Method to compare three float values and get the maximum value.
    public static Float maxFloat(Float x, Float y, Float z){
        Float max = x;
        if(y.compareTo(max) > 0)
            max = y;

        if(z.compareTo(max) > 0)
            max = z;
        return max;
    }

  // Method to compare three strings and get the maximum value.

    public static String maxString(String x, String y, String z) {
        String max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Welcome To Generics \n");
        System.out.println("The maximum value between the three integer is : " + maxInteger(3, 8, 5)+ "\n");
        System.out.println("The maximum value between the three float is : " + maxFloat(1.5f, 3.56f, 5.87f) + "\n");
        System.out.println("The maximum value between the three string is : " + maxString("abc", "pqr", "xyz"));
    }
}

