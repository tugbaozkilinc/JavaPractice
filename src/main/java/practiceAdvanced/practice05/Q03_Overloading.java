package practiceAdvanced.practice05;

public class Q03_Overloading {

    public static void main(String[] args) {

        // Küp, kare prizma ve dikdörtgen prizmanın hacmini hesaplayan bir method oluşturunuz.(Method overloading kullanınız)

        Hacim obj = new Hacim();

        obj.hacimHesapla(5);
        obj.hacimHesapla(6, 7);
        obj.hacimHesapla(5, 6, 7);


    }
}
