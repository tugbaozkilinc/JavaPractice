package practiceAdvanced.practice08;

public class Q03_StringRakamlarToplami {

    public static void main(String[] args) {

        /*
          Kullanıcıdan alınan bir String içerisindeki rakamların toplamını hesaplayan bir method yazınız.
          Örn:
          input : J4\/4 1$ 34$¥
          output : 16
          İpucu:
          Character.isDigit()
          Integer.valueOf()
        */

        String s = "J4/4 1$ 34$¥";
        rakamlarToplami(s);


    }

    public static void rakamlarToplami(String str){

        int sum = 0;

        for (int i = 0; i<str.length(); i++){
            if (Character.isDigit(str.charAt(i))){
                sum += Integer.valueOf("" + str.charAt(i));
            }
        }
        System.out.println("Rakamlar toplami: " + sum);

    }


    // Integer.parseInt() --> int
    // Integer.ValueOf() --> Integer


}
