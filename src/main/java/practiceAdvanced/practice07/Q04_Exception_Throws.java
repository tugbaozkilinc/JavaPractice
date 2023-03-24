package practiceAdvanced.practice07;

public class Q04_Exception_Throws {

    public static void main(String[] args) throws Exception {

    /*
      randomSayi isminde bir method oluşturunuz.
      Bu method içerisinde iki int random sayı oluşturunuz. (0'dan 10 a kadar)
      Bu iki random sayının toplamını yazdırın.
      Eğer bu iki random sayının toplamı 12 den küçükse "Exception" versin ve mesaj olarak
      ("Sayı 12'den küçük ise hata verir") yazdırın.
    */

        randomNumber();

    }

    public static void randomNumber() throws Exception {

        int a = (int)(Math.random()*11);
        int b = (int)(Math.random()*11);
        int sum = a + b;

        if (sum<12){
            throw new Exception("Sayi 12 den kucuk olursa hata verir.");
        }
        System.out.println(sum);

    }


}
