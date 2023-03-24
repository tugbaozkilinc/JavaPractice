package practiceAdvanced.practice10;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Q01_Map_KeyYazdir {

    public static void main(String[] args) {

        //Aşağıda verilen fiyat listesinden fiyatı 29.99 olan ürünlerin adlarını yazdırınız.

        Map<String, Double> urunler = new HashMap<>();
        urunler.put("Kemer", 19.99);
        urunler.put("Gomlek", 29.99);
        urunler.put("Kazak", 24.99);
        urunler.put("Pijama", 29.99);
        urunler.put("Ayakkabi", 89.99);
        urunler.put("Kravat", 19.99);
        urunler.put("Terlik", 29.99);

        // 1. yol:
        Set<String> keys = urunler.keySet();
        for(String w : keys){
            if(urunler.get(w)==29.99){
                System.out.print(w + " ");
            }
        }
        System.out.println();

        // 2. yol:
        for(Map.Entry<String, Double> w : urunler.entrySet()){
            if(w.getValue()==29.99){
                System.out.print(w.getKey() + " ");
            }
        }





    }
}
