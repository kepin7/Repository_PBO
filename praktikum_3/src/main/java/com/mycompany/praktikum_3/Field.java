package com.mycompany.praktikum_3;

public class Field {

    public static final double PI = 3.14;

    public double r;

    public static double radiansToDegrees(double rads) {
        return rads * 180 / PI;
    }

    public double area() {
        return PI * r * r;
    }

    public double kelilingLingkaran() {
        return 2 * PI * r;
    }

    public static void main(String[] args) {
        Field lingkaran = new Field();
        lingkaran.r = 5;

        System.out.println("Radius : " + lingkaran.r);
        System.out.println("Area : " + lingkaran.area());
        System.out.println("Keliling lingkaran : " + lingkaran.kelilingLingkaran());
        System.out.println("180 radian ke derajat : " + Field.radiansToDegrees(180));
    }
}