package practiceAdvanced.practice08;

public class Q01_ForEach_SayiUcgen {

    public static void main(String[] args) {

        /*
             Alttaki şekli veren bir kod yazınız:

                  1 2 3 4 5 6
                   2 3 4 5 6
                    3 4 5 6
                     4 5 6
                      5 6
                       6
        */

        int s = 6;

        for (int i = 1; i<=s; i++){
            for (int k = 1; k<i; k++){
                System.out.print(" ");
            }
            for (int k = i; k<=s; k++){
                System.out.print(k + " ");
            }
            System.out.println();
        }


    }
}
