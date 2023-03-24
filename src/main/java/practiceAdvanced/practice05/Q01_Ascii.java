package practiceAdvanced.practice05;

import java.util.Scanner;

public class Q01_Ascii {

    public static void main(String[] args) {

        // Kullanıcıdan aldığınız iki karakterin arasında bulunan tüm karakterleri yazdıran bir kod yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Bir character giriniz.");
        char ch1 = input.next().charAt(0);
        System.out.println("Bir character giriniz.");
        char ch2 = input.next().charAt(0);

        int first = Math.min(ch1, ch2);
        int second = Math.max(ch1, ch2);

        for (int i = first+1; i<second; i++){
            System.out.print((char)i + " "); // type casting
        }






    }
}
