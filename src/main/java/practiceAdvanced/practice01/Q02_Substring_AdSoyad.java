package practiceAdvanced.practice01;

import java.util.Scanner;

public class Q02_Substring_AdSoyad {

    public static void main(String[] args) {

        /*
          Example 1: Kullanıcıdan tek seferde alacağınız 2 kelimelik ad ve soyadı 2 ayrı kelimeye ayırınız.
          Örn:
          Ad: Ali
          Soyad: Can
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first and last name with a space in between");
        String fullName = scan.nextLine();
        int idxOfSpace = fullName.indexOf(" ");
        String firstName = fullName.substring(0,idxOfSpace);
        String lastName = fullName.substring(idxOfSpace+1);

        System.out.println("Name is: " + firstName);
        System.out.println("Last name is: " + lastName);


    }
}
