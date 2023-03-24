package practiceAdvanced.practice02;

import java.util.Scanner;

public class Q02_For_Continue {

    public static void main(String[] args) {

         // Example 1: Kullanıcıdan 5 adet sayı isteyiniz. Bu sayılardan 5 ile 10 arasındakiler haric, diğerlerinin toplamını bulunuz.

            Scanner input = new Scanner(System.in);
            int sum = 0;

            for(int i = 0; i<5; i++){
                System.out.println("Bir sayi giriniz");
                int s = input.nextInt();
                if(s>5 && s<10){
                    System.out.println("Girdiginiz sayi 5 ile 10 arasinda oldugundan isleme alinmayacaktir.");
                    continue;
                }
                sum += s;
            }
            System.out.println("Sum is: " + sum);
        }



}
