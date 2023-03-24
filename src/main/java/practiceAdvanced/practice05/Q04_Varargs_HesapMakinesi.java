package practiceAdvanced.practice05;

public class Q04_Varargs_HesapMakinesi {

    public static void main(String[] args) {

        // Temel 4 matematik işlemi yapan bir kod yazınız.

        HesapMakinesi obj = new HesapMakinesi();

        obj.add(3, -3, 6, 7);
        obj.multiplication(5, 6, 7, 10);
        obj.subtraction(10, 6);
        obj.division(5, 0);


    }
}
