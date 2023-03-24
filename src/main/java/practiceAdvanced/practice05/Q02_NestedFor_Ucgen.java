package practiceAdvanced.practice05;

public class Q02_NestedFor_Ucgen {

    public static void main(String[] args) {

        /*
          Kullanıcıdan aldığınız satır sayısına göre aşağıdaki şekli yazdıran bir kod yazınız.
               *
              * *
             * * *
            * * * *
           * * * * *
        */

        int line = 5;

        for (int i = 1; i<=line; i++){
            for (int b = line; b>i; b--){
                System.out.print(" ");
            }
            for (int y = 1; y<=i; y++){
                System.out.print("* ");
            }
            System.out.println();
        }



    }
}
