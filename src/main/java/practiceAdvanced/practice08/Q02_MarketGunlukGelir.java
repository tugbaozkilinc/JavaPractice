package practiceAdvanced.practice08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q02_MarketGunlukGelir {

    /*
      Günlük gelir market programı yazınız.
      -Tüm günlerin gelirlerini gösteren bir method,
      -Haftalık gelir ortalamasını gösteren bir method,
      -Hangi günlerin ortalama gelirden fazla geliri olduğunu gösteren bir method,
      -Hangi günlerin ortalama gelirden az geliri olduğunu gösteren bir method,
    */

    static List<String> gunler = new ArrayList<>(Arrays.asList("Pazartesi", "Sali", "Carsamba", "Persembe", "Cuma", "Cumartesi", "Pazar"));
    static List<Double> gunlukGelir = new ArrayList<>();
    static double toplamGelir = 0;


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int gun = 0;
        while (gun<7){
            System.out.println(gunler.get(gun) + " gelirini giriniz");
            double gununGeliri = input.nextDouble();
            gunlukGelir.add(gununGeliri);
            toplamGelir += gununGeliri;
            gun++;
        }
        System.out.println("Gunluk gelir: " + gunlukGelir);
        System.out.println("Toplam gelir: " + toplamGelir);
        System.out.println("Gelir ortalamasi: " + gelirOrtalamasi());
        System.out.println("Ortalama ustu gunler: " + ortalamaUstuGunler());
        System.out.println("Ortalama alti gunler: " + ortalamaAltiGunler());

    }

    static double gelirOrtalamasi(){

        return toplamGelir/gunler.size();
    }

    static String ortalamaUstuGunler(){

        String str = "";
        for (int i = 0; i<gunlukGelir.size(); i++){
            if (gunlukGelir.get(i)>gelirOrtalamasi()){
                str += gunler.get(i) + " ";
            }
        }

        return str;
    }

    static String ortalamaAltiGunler(){

        String str = "";
        for (int i = 0; i<gunlukGelir.size(); i++){
            if (gunlukGelir.get(i)<gelirOrtalamasi()){
                str += gunler.get(i) + " ";
            }
        }

        return str;
    }



}
