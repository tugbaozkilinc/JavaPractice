package practiceAdvanced.practice06;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Q05_Inheritance_HacimHesaplama {

    // Kare prizma, silindir ve koninin hacmini hesaplayan bir kod yaziniz. (Inheritance kullaniniz.)

    public static void main(String[] args) {

        KarePrizma karePrizma = new KarePrizma();
        double kph = karePrizma.hacimHesapla(5, 6); // Method kendi class indan gelmedigi icin bold yazili degildir.
        System.out.println(kph); // 150.0

        Koni koni = new Koni();
        double kh = koni.hacimHesapla(3, 5);
        System.out.println(kh);
        NumberFormat numberFormat = new DecimalFormat(".00");
        String formattedKh = numberFormat.format(kh);
        System.out.println(formattedKh); // 47.10

        Silindir silindir = new Silindir();
        double sh = silindir.hacimHesapla(1, 5);
        System.out.println(numberFormat.format(sh)); // 15.70



    }

}
