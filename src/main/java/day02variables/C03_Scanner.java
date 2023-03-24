package day02variables;

import java.util.Scanner;

public class C03_Scanner {

    public static void main(String[] args) {

        // Example 1: Kullanicidan alinan yaricap ile cemberin cevresini ve dairenin alanini hesaplayan bir program yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Yaricap giriniz");
        double r = input.nextDouble();
        System.out.println("Cemberin cevresi: " + 2*314*r/100 + " Dairenin alani: " + 314*r*r/100); // virgulden sonra cok uzamasın diye *314/100 yazdik.

        // Example 2: Kullanicidan bir dikdortgenin uzun ve kisa kenarlarini aliniz ve dikdortgenin alan ve cevre hesabini yapan bir program yaziniz.

        System.out.println("Dikdortgenin uzun ve kisa kenarini giriniz");
        double kisa = input.nextDouble();
        double uzun = input.nextDouble();
        System.out.println("Dikdortgenin cevresi: " + 2*(kisa+uzun) + " Dikdortgenin alani: " + kisa*uzun);

        // Example 3: Kenar uzunluklari kullanicidan alinan bir ucgenin cevresini hesaplayan bir program yaziniz.

        System.out.println("Ucgenin uc kenar uzunlugunu giriniz");
        byte a = input.nextByte();
        byte b = input.nextByte();
        byte c = input.nextByte();
        int cevre = a + b + c;
        System.out.println("Ucgenin cevresi: " + cevre);

        /*
          Example 4: Kullanicidan aldiginiz karakter ile asagidaki gibi bir gorunum olusturan bir kod yaziniz.

              A
             A A
            A A A
        */

        System.out.println("Bir karakter giriniz");
        char ch = input.next().charAt(0);

        System.out.println("  " + ch + "  ");
        System.out.println(" " + ch + " " + ch);
        System.out.println(ch + " " + ch + " " + ch);



    }
}
