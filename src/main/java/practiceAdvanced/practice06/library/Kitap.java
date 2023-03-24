package practiceAdvanced.practice06.library;

public class Kitap {
    String kitapAdi;
    String yazarAdi;
    int sayfaSayisi;
    String seriNo;
    static int kitapSayisi;

    // sag tık - generate - constructor

    public Kitap(String kitapAdi, String yazarAdi, int sayfaSayisi) {
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.sayfaSayisi = sayfaSayisi;
        kitapSayisi++;
        seriNo = yazarAdi.substring(0,2) + kitapAdi.substring(0,2) + kitapSayisi; // seriNo ile karsılastıracak bir parametre olmadıgı icin kelime karısıklıgı olmayacagından dolayı
                                                                                  // this. i kaldırdım.
    }

    public void kitapBilgileri(){
        System.out.println("Kitap Adi: " + kitapAdi + "\nYazar Adi: " + yazarAdi + "\nSayfa Sayisi" + sayfaSayisi + "\nSeri No: " + seriNo);
        System.out.println("==============");
    }
    // Market_Constructor da oldugu gibi her obje icin degerleri uzun uzun yazmamak icin burda bir method olusturdum ve biz kez yazdim. Ihtiyac duydukca method u cagiracagim.



}
