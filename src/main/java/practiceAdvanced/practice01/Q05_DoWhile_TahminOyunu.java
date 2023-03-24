package practiceAdvanced.practice01;

import java.util.Scanner;

public class Q05_DoWhile_TahminOyunu {

    public static void main(String[] args) {

        // 0 ile 100 arasında rastgele numara tahmini yapan bir kod yazın.
        // İpucu: Girdiğiniz numara rastgeleNumara'dan küçükse ==> Daha büyük bir numara giriniz.
        //        Girdiğiniz numara rastgeleNumara'dan büyükse ==> Daha küçük bir numara giriniz.
        //        Girdiğiniz numara rastgeleNumara'ya eşitse ==> Tebrikler!!!

        Scanner scan = new Scanner(System.in);
        int s;
        int randomS = (int)(Math.random()*100)+1; // Math.random() 0 ile 1 arasinda bize rastgele bir ondalikli sayi verir. 0 ile 100 arasinda vermesini istersem 100 ile carparim;
                                                  // Math.random()*100 ama 100 dahil degil, 100 dahil olsun istersem 1 eklerim; (Math.random()*100)+1, ondalikli sayi verecegi icin de
                                                  // integer a ceviririm; (int)(Math.random()*100)+1
                                                  // Burda Math.random() i integer a cevirirsem (int)Math.random() bana her zaman 0 verir, 0 i 100 ile carparsam da sonuc 0 olur.
        int count = 0;

        do {
            count++;
            System.out.println("1-100 arasi bir sayi tahmini giriniz");
            s = scan.nextInt();
            if (s==randomS){
                System.out.println("Tebrikler!!");
            } else if (s<randomS){
                if (count!=10){
                    System.out.println("Daha buyuk bir sayi giriniz");
                    System.out.println(10-count + " hakkiniz kaldi!");
                }
            } else {
                if (count!=10){
                    System.out.println("Daha kucuk bir sayi giriniz");
                    System.out.println(10-count + " hakkiniz kaldi!");
                }
            }
            if (count==10){
                if (s!=randomS) {
                    System.out.println("Hakkiniz bitti oyunu kaybettiniz\nTekrar oynamak icin 1, cikmak icin 2 giriniz");
                }
                int secenek = scan.nextInt();
                if (secenek==1){
                    count = 0;
                    randomS = (int)(Math.random()*100)+1;
                } else {
                    System.out.println("Gule gule!!!");
                    break;
                }
            }
        }while (s!=randomS);


    }
}
