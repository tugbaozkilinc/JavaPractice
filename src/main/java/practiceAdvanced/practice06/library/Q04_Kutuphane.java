package practiceAdvanced.practice06.library;

public class Q04_Kutuphane {

    public static void main(String[] args) {

        // Kütüphaneye eklemek istediğiniz kitapları, adı, yazar adı, sayfa sayısı, seri numarası ile yazdıran bir kod yazınız.

        Kitap kitap1 = new Kitap("Harry Potter", "j k rowling", 500);
        kitap1.kitapBilgileri();
        new Kitap("1984", "George Orwell", 352).kitapBilgileri();

        /*
          new Kitap("1984", "George Orwell", 352); Kitap class indan olusturdugum bu objeyi neyin icine koyabilirim?
          Kitap Class turundeki(data tipindeki) container a koyabilirim;
          Object Class a koyabilirim; fakat o zaman hicbir method ve variable a ulasamam. Sadece datayi icine koymaya yarar.
          Kitabin parent larina da koyabilirim.
          Kutuphane kitap1 = new Kitap(); objenin olusturuldugu class Kitap Class idir. Obje olusturuldugu class in ozelliklerini tasir.
          Oncelik objenin olusruldugu class a aittir.
        */



    }
}
