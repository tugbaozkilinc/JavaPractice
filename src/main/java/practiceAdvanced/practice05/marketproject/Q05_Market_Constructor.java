package practiceAdvanced.practice05.marketproject;

public class Q05_Market_Constructor {

    public static void main(String[] args) {

        // Ürün adı, ürün fiyatı ve (varsa) son kullanma tarihlerini yazdıran bir market programı yazınız..

        Market obj1 = new Market("Ekmek", 5, 1);
        System.out.println("Urun adi: " + obj1.urunAdi + " Urun fiyati: " + obj1.urunFiyati + " Son kullanma tarihi: " + obj1.sonKullanmaTarihi);

        Market obj2 = new Market("Nutella", 45, 20);
        System.out.println("Urun adi: " + obj2.urunAdi + " Urun fiyati: " + obj2.urunFiyati + " Son kullanma tarihi: " + obj2.sonKullanmaTarihi);

        Market obj3 = new Market("Bardak", 50);
        System.out.println("Urun adi: " + obj3.urunAdi + " Urun fiyati: " + obj3.urunFiyati + " Son kullanma tarihi: " + obj3.sonKullanmaTarihi);



    }
}
