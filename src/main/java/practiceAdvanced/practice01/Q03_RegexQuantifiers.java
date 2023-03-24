package practiceAdvanced.practice01;

public class Q03_RegexQuantifiers {

    public static void main(String[] args) {

        String str = "as";

        // Example 1: Bir String degerin belirli sayida karakter içerip belirli bir karakter ile bitip bitmediğini kontrol eden bir kod yazınız.
        // matches(String regex); String degerin regex ile karsilastirmasini yapar, boolean return eder.
        System.out.println(str.matches("..")); // true ==> ".." 2 karakterli olup olmadigini kontrol eder.
        System.out.println(str.matches(".s")); // true ==> ".s" herhangi bir karakterle baslayip s ile bitiyor olup olmadigini kontrol eder.
        System.out.println(str.matches("...")); // false ==> 3 karakterli olmadigi icin

        // Example 2: Bir String değerin ikinci karakterinin belirli bir karakter olup olmadığını kontrol eden bir kod yazınız.
        System.out.println("qsdghghfgj".matches(".s.*")); // true ==> ".*" istedigin kadar karakter anlamina gelir; sifir ya da daha fazla.
        System.out.println("qs".matches(".s.*")); // true
        System.out.println("qs".matches(".r.*")); // false

        // Example 3: Bir String değerin sadece harf içerip içermediğini kontol eden bir kod yazınız.
        System.out.println("abc".matches("[a-zA-Z]*")); // true ==> *(quantifier) koymazsam false verir, cunku 1 tane icerir anlamina gelir; * ile esnek sayida karakter manasindadir.
        System.out.println("abc".matches("\\w")); // false
        System.out.println("ab".matches("\\w{2}")); // true
        System.out.println("abc".matches("\\w*")); // true
        System.out.println("a".matches("[a-zA-Z]?")); // true
        System.out.println("".matches("[a-zA-Z]?")); // true
        System.out.println("abc".matches("[a-zA-Z]?")); // false ==> ?(quantifier) 0 veya 1 icin true verir.

        // Example 3: Bir String değerin belirli bir sayıda belirli karakterleri içerdiğini kontrol eden bir kod yazınız.
        System.out.println("abchd".matches("[a-zA-Z]{5}")); // true ==> 5 karakterli ve hepsi de buyuk-kucuk harf olmali

        // Example 4: Bir String değerin belirli karakterleri en az belirli sayıda içerip içermediğini kontrol eden bir kod yazınız.
        System.out.println("1234567".matches("[0-9]{6,}")); // true ==> 6, en az 6 tane manasindadir.

        // Example 5: Bir String değerin belirli karakterleri en az ve en çok belirli sayıda içerip içermediğini kontrol eden bir kod yazınız.
        // \\w ==> [a-zA-Z0-9_]
        System.out.println("abcd123".matches("\\w{7,10}")); // true ==> en az 7 en fazla 10 character

        // Example 6: ilk karakter 1, ikinci karekter noktalama işareti ve kalan 8 karakter rakam toplam 10 karakter olmali
        System.out.println("1?12345678".matches("[1][\\p{Punct}][0-9]{8}")); // true
        System.out.println("1?12345678".matches("[1][\\p{Punct}][0-9]*")); // true
        System.out.println("1?!.12345678".matches("[1][\\p{Punct}]{3}[0-9]*")); // true
        System.out.println("1?!.12345678".matches(".[\\p{Punct}]{3}[0-9]*")); // true
        System.out.println("2s1234abcd7464537".matches("[2][s][0-9]{4}[a-z]{4}.*")); // true


    }
}
