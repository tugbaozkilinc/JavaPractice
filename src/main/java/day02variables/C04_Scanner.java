package day02variables;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

        // Example 1: Kullanicinin  girdigi 4 basamakli sayinin ilk ve son rakaminin toplamini ekrana yazdiran programi yaziniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Dort basamakli bir sayi giriniz");
        int s = scan.nextInt();

        int sonRakam = s%10;
        int ilkRakam = s/1000;
        System.out.println("Ilk ve son rakamin toplami: " + (ilkRakam + sonRakam));

        // Example 2: Kullanicidan uc basamakli bir sayi alin ve sayinin rakamlarini birler, onlar ve yuzler basamagi olarak yazdirin.

        System.out.println("Uc basamakli bir sayi giriniz");
        int n = scan.nextInt();

        int birler = n%10;
        n/=10;
        int onlar = n%10;
        n/=10;
        int yuzler = n%10;
        System.out.println("Birler basamagi: " + birler + " Onlar basamagi: " + onlar + " Yuzler basamagi: " + yuzler);


    }
}
