package practiceAdvanced.practice05.marketproject;

import java.time.LocalDate;

public class Market {
    String urunAdi;
    double urunFiyati;
    String sonKullanmaTarihi;

    Market(String urunAdi, double urunFiyati, int tuketimsuresi){
        this.urunAdi = urunAdi;
        this.urunFiyati = urunFiyati;
        this.sonKullanmaTarihi = LocalDate.now().plusMonths(tuketimsuresi).toString();
        System.out.println("Uc parametreli constructor calisti");
    }

    Market(String urunAdi, double urunFiyati){
        this.urunAdi = urunAdi;
        this.urunFiyati = urunFiyati;
        this.sonKullanmaTarihi = "Bu urunun son kullanma tarihi yoktur";
        System.out.println("Iki parametreli constructor calisti");
    }


}
