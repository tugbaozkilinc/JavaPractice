package practiceAdvanced.practice07;

public class Q03_AtbashCode {

    public static void main(String[] args) {

        /*
          Kullanıcıdan aldığınız bir metni 'Atbash Code' yöntemi ile şifreleyen bir kod yazınız.
          Ortadoğuda kullanılan en eski şifreleme biçimlerinden biridir.
          Arami alfabesinin tersten yazılması ile oluşturulan bir kodlayıcıya sahiptir.
          Örn: A-->Z, B-->Y ...
          "abcdefghijklmnopqrstuvwxyz";
          "zyxwvutsrqponmlkjihgfedcba";
        */

        // 1. yol:
        String s = "ali";
        String s1 = "abcdefghijklmnopqrstuvwxyz";
        String s2 = "zyxwvutsrqponmlkjihgfedcba";

        for (int i = 0; i<s.length(); i++){
            for (int j = 0; j<s1.length(); j++){
                if (s.charAt(i)==s1.charAt(j)){
                    System.out.print(s2.charAt(j));
                }
            }
        }

        System.out.println();

        // 2. yol:
        s = "veli";

        for (int i = 0; i<s.length(); i++){
            int idx = 'z'-s.charAt(i);
            System.out.print((char)('a' + idx));

        }











    }
}
