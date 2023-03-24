package practiceAdvanced.practice09.Q03_AbstractionAlanHesaplama;

public class Runner {

    public static void main(String[] args) {

        // Dikdörtgen ve üçgenin alanlarını hesaplayan bir kod yazınız.(abstraction kullanın)

        Ucgen ucgen = new Ucgen();
        System.out.println(ucgen.alanHesapla(4, 2));

        Dikdortgen dikdortgen = new Dikdortgen();
        System.out.println(dikdortgen.alanHesapla(5, 4));

        // System.out.println(new Dikdortgen().alanHesapla(5, 4)); yazarsan eger her islem icin object olusturmus olursun, bu da memory israfi demek.
        // Bu yuzden biz tek bir obje olsturup butun islemleri o obje uzerinden yapariz.



    }

}
