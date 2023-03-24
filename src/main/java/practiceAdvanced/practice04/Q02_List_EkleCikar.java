package practiceAdvanced.practice04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q02_List_EkleCikar {

    public static void main(String[] args) {

        /*
          Kullanıcıdan aldığınız bir sayıyı bir list'e ekleyen, list'ten çıkaran ya da mevcut bir elementi o sayı ile güncelleyen bir kod yazınız.
        */

        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        String command;
        int s;

        do {
            System.out.println("Ekleme yapmak icin 'add'\n" +
                    "Guncelleme yapmak icin 'update'\n" +
                    "Silmek icin 'delete'\n" +
                    "Cikmak icin 'quit' komutunu giriniz.");

            command = scan.next();
            if (command.equalsIgnoreCase("add")){
                System.out.println("Eklemek istediginiz element i giriniz.");
                s = scan.nextInt();
                list.add(s);
            } else if (command.equalsIgnoreCase("update")){
                System.out.println("Guncellemek istediginiz element i giriniz.");
                s = scan.nextInt();
                System.out.println("Eklemek istediginiz yeni element i giriniz.");
                int updateS = scan.nextInt();
                list.set(list.indexOf(s), updateS);

            } else if (command.equalsIgnoreCase("delete")){
                System.out.println("Silmek istediginiz istediginiz element i giriniz.");
                s = scan.nextInt();
                list.remove((Integer)s);
            } else if (command.equalsIgnoreCase("quit")){
                break;
            } else {
                System.out.println("Gecerli bir komut giriniz");
            }
            System.out.println(list);
        }while (true);

        System.out.println("Gule gule!!!");


    }
}