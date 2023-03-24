package practiceAdvanced.practice01;

import java.util.Scanner;

public class Q04_IfStatement_DikUcgen {

    public static void main(String[] args) {

        // Example 1:  Kullanıcıdan üç adet sayı alarak bu sayıların  bir dik üçgenin kenar uzunlukları olup olmadığını hesaplayan bir kod yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if ((a*a + b*b == c*c) || (c*c + b*b == a*a) || (a*a + c*c == b*b)){
            System.out.println("This is a right triangle");
        } else
            System.out.println("This is not a right triangle");

    }
}
