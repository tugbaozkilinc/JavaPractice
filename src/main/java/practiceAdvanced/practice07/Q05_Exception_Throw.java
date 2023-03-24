package practiceAdvanced.practice07;

import java.util.Random;

public class Q05_Exception_Throw {

    public static void main(String[] args) {

    // 4. class taki sorunun try-catch ile cozumu

            randomNumber();

    }

    public static void randomNumber() {

        Random random = new Random();

        while (true) {
            int a = random.nextInt(11);
            int b = random.nextInt(11);
            try {
                if (a+b<12){
                    throw new Exception();
                } else {
                    System.out.println(a + " + " + b + " = " + (a+b));
                    break;
                }
            }catch (Exception e){
                System.out.println(a + " + " + b + " = " + (a+b));
                System.out.println("Toplam 12 den kucuk olamaz");
                break;
            }
        }

    }



}
