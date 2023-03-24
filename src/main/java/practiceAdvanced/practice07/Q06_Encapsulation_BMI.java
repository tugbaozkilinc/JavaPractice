package practiceAdvanced.practice07;

import java.util.Scanner;

public class Q06_Encapsulation_BMI {

    /*
      BMI hesaplama kodu yazınız. (Güvenliği göz ardı etmeyin).
      BMI(Vücut Kitle Endeksi):
      BMI, vücut kütlesinin vücut boyunun karesine bölünmesi olarak tanımlanır.
      Başlıca yetişkin BMI sınıflandırmaları, zayıf (18,5 kg/m2'nin altında), normal ağırlık (18,5 ila 25),
      fazla kilolu (25 ila 30) ve obez (30 veya daha fazla) şeklindedir.
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight");
        double kilo = input.nextDouble();
        System.out.println("Enter your height");
        double boy = input.nextDouble();

        BMI person1 = new BMI(kilo, boy);
        person1.calculateBMI();
        System.out.println(person1);

    }



}
