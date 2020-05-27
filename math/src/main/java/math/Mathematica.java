package math;
import java.lang.Math;


public class Mathematica {
    public int fact(int num){
        int res = 0;
        for(int i = 0; i <= num; i++){
            res += i;
        }
        return res;
    }
    public int pow(int num, int power){
        int res = num;
        for(int i = 0; i < power; i++){
            res *= num;
        }
        return res;
    }

    public double log(int num, int base){
        return Math.log(num) / Math.log(base);
    }

    public static void main(String[] args){
        Mathematica app = new Mathematica();
        System.out.println(app.fact(10));
        System.out.println(app.pow(10, 3));
        System.out.println(app.log(100, 10));
    }

}