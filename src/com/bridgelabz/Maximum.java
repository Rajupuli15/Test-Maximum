package com.bridgelabz;

public class Maximum {

    public static Integer maxInteger(Integer x, Integer y, Integer z) {
        Integer max = x;
        if (y.compareTo(max) > 0)
            max = y;

        if (z.compareTo(max) > 0)
            max = z;
            return max;
        }

        public static void main(String[] args) {
            System.out.println("Welcome To Generics \n");
            System.out.println("The maximum value between the three integer is : " + maxInteger(3, 8, 5));
        }
    }
