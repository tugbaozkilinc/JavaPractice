package practiceAdvanced.practice09;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Q02_Map_UrunFiyatlariniToplaEntrySet {

    public static void main(String[] args) {

        // Bir map içerisinde verilen fiyatların toplamını bulan bir kod yazınız.(for each loop kullanınız)
        // Örn: {Kemer=19.99, Gömlek=29.99, Ayakkabı=89.99, Kazak=24.99, Kravat=19.99} ==> Toplam: 184.95

        HashMap<String, Double> price = new HashMap<>();
        price.put("Kemer", 19.99);
        price.put("Gömlek", 29.99);
        price.put("Ayakkabı", 89.99);
        price.put("Kazak", 24.99);
        price.put("Kravat", 19.99);

        System.out.println(calculatePrice(price));


    }

    public static double calculatePrice(Map<String, Double> map){

        System.out.println("Urunler ve fiyatlari: " + map);
        double sum = 0;
        for (Map.Entry<String, Double> w : map.entrySet()){
            sum += w.getValue(); // key i almak istersen get.key() kullan.
        }
        return sum;

    }



}
