package practiceAdvanced.practice02;

import java.util.Scanner;

public class Q01_If_Diskriminant {

    public static void main(String[] args) {

        /*

          if statement ile katsayıları verilen 1 bilinmeyenli denklemin köklerini bulunuz; ax^2 + bx + c;
          Delta = bb - 4ac
          Delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2a), x2= (-b - kök(d)) / (2*a)
          Delta = 0 => 1 tane kök vardır x = -b/2a
          Delta < 0 => kök yoktur.

        */

        Scanner input = new Scanner(System.in);
        System.out.println("Denklemin a, b ve c sayilarini sirayla giriniz.");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double delta = b*b-4*a*c;

        if(delta>0){
            double x1 = (-b+Math.sqrt(delta))/(2*a); // Math.sqrt(); karekok alir.
            double x2 = (-b-Math.sqrt(delta))/(2*a);
            System.out.println("Denkleminiz: " + a + "x²+" + b + "x+" + c);
            System.out.println("Denklemin iki kökü vardır: x1 = " + x1 + " x2 = " + x2);
        }else if (delta==0){
            double x = -b/(2*a);
            System.out.println("Denkleminiz: " + a + "x²+" + b + "x+" + c);
            System.out.println("Denklemin bir kökü vardır: x = " + x);
        }else {
            System.out.println("Denkleminiz: " + a + "x²+" + b + "x+" + c);
            System.out.println("Denklemin bir kökü yoktur.");
        }
    }




}

