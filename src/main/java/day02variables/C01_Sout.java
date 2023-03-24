package day02variables;

public class C01_Sout {

    public static void main(String[] args) {

        // CTRL+D : yazdigimiz satiri cogaltir. Imlecin sout satirinin sonunda iken CTRL+D ye bas.
        // Consol un diger adi terminal. (tabnine: intellij de kullanabilecegin ve tekrarli durumlar icin kolaylik saglayan otomatik kod tamamlama yazilimi)
        // soutv bazi kodlari otomatik getiriyor.
        // sout in icini mumkun oldugu kadar sade birak.
        // sout icinde bir String ile toplama islemi yapmak istediginde toplamayi parantez icine almayi unutma,java String ile toplayacagin herseyi concatination yapar.
        // Sag ust kosedeki uyari isaretine tiklarsan java nin uyarilarini gorebilirsin. Gereksiz is yaptin manasindadir.
        // Non-Primitive data types : String, Arrays, Classes, Interface
        // Butun kodunu yoruma cevirmek istersen basina /* sonuna */ koy.

        /*
           CTRL+ALT+L : sayfayi duzenler.
           \n : alt satira gecirir.
           \t : tab bosluk birakir.
           \b : gerisindeki harfi siler.
           \\ : backward slash yazdirir.
           \' : tek tirnak yazdirir.
           \" : cift tirnak yazdirir.
        */

        System.out.println("T\nE\nC\nH\nP\nR\nO\n\nE\nD\nU\nC\nA\nT\nI\nO\nN");

        // Example 2: "JAVA ILE GUZEL DUNYA" cumlesini her kelime alt alta gelecek sekilde yazdiran bir kod yaziniz.

        System.out.println("\nJAVA\nILE\nGUZEL\nDUNYA");

        // Example 3: "java ile guzel dunya" cumlesini kelimeler arasinda bir tab bosluk olacak sekilde yazdiran bir kod yaziniz.

        System.out.println("\njava\tile\tguzel\tdunya");

        // Example 4: " java ile guzel dunya" cumlesini aralarinda bosluk olmayacak sekilde yazdiran bir kod yaziniz.

        System.out.println("\njava \bile \bguzel \bdunya");

        // Example 5: "Pazartesi" kelimesini her harfi ayri bir satira gelecek sekilde yazdiran bir kod yaziniz.

        System.out.println("\nP\na\nz\na\nr\nt\ne\ns\ni");

        // Example 6: "Techpro" ile java cok 'kolay' yazdiran bir kod yaziniz.

        System.out.println("\n\"Techpro\" ile java cok \'kolay\'");

        /* Example 7: "MAHARET" hic 'DUSMEMEK'  degil; "Her dustugunde kalkabilmektir" cumlesini

        "MAHARET" hic 'DUSMEMEK' degil;



            "Her dustugunde kalkabilmektir" seklinde noktali virgulden sonra 3 satir asagidan ve satir basi bir tab bosluk birakarak yazdiran bir kod yaziniz.*/

        System.out.println("\n\"MAHARET\" hic \'DUSMEMEK\' degil;\n\n\n\t\"Her dustugunde kalkabilmektir\"");

        // Ascii table a bakmadan harfin degerini bulmak istersen o harf ile 0 i topla; System.out.println('a' + 0);

        int m = 'm';
        System.out.println(m);

        char ch = 'a';
        System.out.println((int)ch);
        System.out.println((int)'a');


    }
}
