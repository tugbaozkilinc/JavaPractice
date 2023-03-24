package practiceAdvanced.practice01;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Q01_Variable_FahrenheitToCelsius {

    public static void main(String[] args) {

        // Note: package ismi snake case camel case degil.

        // Example 1: Fahrenheit değeri, Celsius değere çeviren kod yazınız. formul: c = (f-32)*5/9

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a fahrenheit value");
        double fahrenheit = input.nextDouble();
        double celsius = (fahrenheit-32)*5/9;
        System.out.println("The celsius value is: " + celsius);

        NumberFormat numberFormat = new DecimalFormat(".0");
        String formattedCelsius = numberFormat.format(celsius);
        System.out.println(formattedCelsius);
        double c = Double.valueOf(formattedCelsius);

        // double ondalik kisimda uzun degerler yazdirabilir, bunun onune gecmek icin;
        // Bu bir String oldugu icin bu degerle islem yapmak istersem eger numeric bir degere dondurmeliyim



    }
}
