package practiceAdvanced.practice02;

import java.util.Scanner;

public class Q04_NestedFor_Matrix {

    public static void main(String[] args) {

       /*
         Example 1: 2 boyutlu bir tablo olarak, ekrana çarpım tablosunu hesaplayıp yazan kodu yazınız.

         01 02 03 04 05
         02 04 06 08 10
         03 06 09 12 15
         04 08 12 16 20
         05 10 15 20 25
       */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir integer giriniz");
        int s = input.nextInt();

            for(int j = 1; j<=s; j++){

                for(int i = 1; i<=s; i++){

                    System.out.print(String.format("%02d",j*i) + " "); // String.format() ==> Sayinin formatını belirler; "%01d" olursa tek basamakli 1, "%03d" olursa 3 basamakli yapar.
                                                                       // %02d tamsayiyi 2 basamakla bicimlendir, sola sıfırla doldur.
                }
                System.out.println();
            }
        }



}

