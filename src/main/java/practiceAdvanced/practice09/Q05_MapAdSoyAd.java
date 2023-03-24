package practiceAdvanced.practice09;

import java.util.HashMap;
import java.util.Map;

public class Q05_MapAdSoyAd {

    /*
      İki farklı Array'de aynı indekste barındırılan ad ve soyadları örnekteki gibi yazdıran bir kod yazınız.
      input : {"John", "Mark", "Ali"}; {"Doe", "Twain", "Can"};
      output : {John=Doe, Mark=Twain, Ali=Can};
    */

    public static void main(String[] args) {

        String ad[] = {"John", "Mark", "Ali"};
        String soyAd[] = {"Doe", "Twain", "Can"};

        Map<String, String> adSoyad = new HashMap<>();

        for(int i = 0; i< ad.length; i++){
            adSoyad.put(ad[i], soyAd[i]);
        }

        System.out.println(adSoyad);



    }
}
