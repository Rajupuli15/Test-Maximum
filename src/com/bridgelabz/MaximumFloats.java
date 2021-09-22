package com.bridgelabz;

public class MaximumFloats {

    public static Integer maxInteger(Integer x, Integer y, Integer z){
        Integer max = x;
        if(y.compareTo(max) > 0)
            max = y;

        if(z.compareTo(max) > 0)
            max = z;

        return max;
    }

    public static Float maxFloat(Float x, Float y, Float z){
        Float max = x;
        if(y.compareTo(max) > 0)
            max = y;

        if(z.compareTo(max) > 0)
            max = z;
            return max;
    }


    private static void printMaxFloat(Float x, Float y, Float z, Float max){
        System.out.println("Welcome To Generics \n");
        System.out.println("Maximum integer value is : " + maxInteger(2,4,6));
        System.out.println("Maximum Value of three float is : " + maxFloat(6.8f,2.1f,4.23f));
    }
}

