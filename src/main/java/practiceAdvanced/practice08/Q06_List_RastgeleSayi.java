package practiceAdvanced.practice08;

import java.util.ArrayList;
import java.util.List;

public class Q06_List_RastgeleSayi {

    public static void main(String[] args) {

        /*
          Bir List içerisine 0'dan 20'ye rastgele 10 tam sayi atayan ve atanan çift sayıları "ciftSayi" String değerine
          dönüştüren bir kod yazınız. Eğer çift sayi içermezse "Cift Sayi Yoktur" yazdırın.
          Örn:[19, 11, 10, 19, 4, 6, 15, 18, 1, 14]
          [19, 11, CiftSayi, 19, CiftSayi, CiftSayi, 15, CiftSayi, 1, CiftSayi]
        */

        List<Object> list = new ArrayList<>();
        randomNumber(list);

    }

    public static void randomNumber(List<Object> list){

        for (int i = 0; i<10; i++){
            list.add((int)(Math.random()*21));
        }
        System.out.println(list);

        for (int i = 0; i<list.size(); i++){
            if ((int)list.get(i)%2==0){
                list.set(i, "CiftSayi");
            }
        }
        System.out.println(list);

    }



}
