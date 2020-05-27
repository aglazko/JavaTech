package test_math;

import math.Mathematica;

public class TestMath {
    public static void main(String[] args) {
        Mathematica mathematica = new Mathematica();
        System.out.println(mathematica.fact(10));
        System.out.println(mathematica.log(625, 25));
        System.out.println(mathematica.pow(10, 3));
    }
}