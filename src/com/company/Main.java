package com.company;

public class Main {

    public static void main(String[] args) {
        double c = 2.43;

        String[] types = {"k","re","ra","f"};

        for (int i = 0; i < types.length; i++) {
            if (types[i] == "f") {
                double f = c * 1.8 + 32;
                System.out.println("Temperature in Fahrenheit is: " + f);
            } else if (types[i] == "k") {
                double k = c + 273.15;
                System.out.println("Temperature in Kelvin is: " + k);
            } else if (types[i] == "re") {
                double re = c * 0.8;
                System.out.println("Temperature in Réaumur is: " + re);
            } else if (types[i] == "ra") {
                double ra = c * 1.8 + 32 + 459.67;
                System.out.println("Temperature in Réaumur is: " + ra);
            }
        }
    }
}
