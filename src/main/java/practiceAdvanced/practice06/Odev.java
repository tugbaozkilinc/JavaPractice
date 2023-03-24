package practiceAdvanced.practice06;

import java.time.DayOfWeek;
import java.time.Month;
import java.util.Scanner;

public class Odev {

    public static void main(String[] args) {

        // Kullanıcıdan aldığınız güne göre o günden kaç gün sonrasının hangi güne denk geldiğini yazdıran bir kod yazınız.
        // pazartesi hafta başlangıcı

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir gun giriniz");
        String day = scan.next().toLowerCase();
        System.out.println("Kac gun sonrasinin hangi gune geldigini bilmek istiyorsunuz?");
        int howManyDaysLater = scan.nextInt();

        switch (day){
            case "pazartesi":
                System.out.println(DayOfWeek.MONDAY.plus(howManyDaysLater));
                break;
            case "sali":
                System.out.println(DayOfWeek.TUESDAY.plus(howManyDaysLater));
                break;
            case "carsamba":
                System.out.println(DayOfWeek.WEDNESDAY.plus(howManyDaysLater));
                break;
            case "persembe":
                System.out.println(DayOfWeek.THURSDAY.plus(howManyDaysLater));
                break;
            case "cuma":
                System.out.println(DayOfWeek.FRIDAY.plus(howManyDaysLater));
                break;
            case "cumartesi":
                System.out.println(DayOfWeek.SATURDAY.plus(howManyDaysLater));
                break;
            case "pazar":
                System.out.println(DayOfWeek.SUNDAY.plus(howManyDaysLater));
                break;
            default:
                System.out.println("Gecerli gun ismi giriniz.");
        }




    }

}
