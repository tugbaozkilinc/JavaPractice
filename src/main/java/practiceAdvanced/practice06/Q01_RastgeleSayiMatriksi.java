package practiceAdvanced.practice06;

public class Q01_RastgeleSayiMatriksi {

    public static void main(String[] args) {

        /*
          Kullanıcıdan aldığınız bir sayi kadar satır ve sütun sayısına sahip alttaki rastgele 0 ve 1'lerden oluşan matriksi yazdırın.
          Input: 10
          Output:
                 1 0 0 1 1 0 0 0 1 1
                 0 0 1 0 1 0 1 0 0 0
                 0 1 0 1 0 0 0 0 0 1
                 1 1 1 0 0 0 0 1 1 1
                 1 1 0 1 1 1 0 1 0 0
                 1 0 0 0 1 1 0 0 0 0
                 0 0 1 0 0 0 0 1 1 1
                 1 1 0 1 0 1 0 0 1 0
                 0 0 1 0 0 0 0 1 1 0
                 1 1 1 0 0 1 1 1 1 0
         */

        int s = 10;

        for (int i = 0; i<s; i++){
            for (int j = 0; j<s; j++){
                System.out.print((int)(Math.random()*2) + " ");

            }
            System.out.println();
        }


    }
}
