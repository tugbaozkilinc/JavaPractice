package practiceAdvanced.practice08;

import java.util.Arrays;

public class Q05_Array_HarfKullanimSayisi {

    public static void main(String[] args) {

        /*
          Girilen String'de hangi harfin kaç kere kullanıldığını yazan bir kod yazınız.
          Input: String str = "Java is so Good";
          Output: String strOutput = "J1 a2 v1 i1 s2 o3 G1 d1";
        */

        String str = "Java is so Good";
        String[] arr = str.split("");
        Arrays.sort(arr);
        int counter = 0;

        for (int i = 1; i< arr.length; i++){
            if (arr[i-1].equals(arr[i])){
                counter++;
            } else {
                System.out.print(arr[i-1] + (counter+1) + " ");
                counter = 0;
            }
            if (i== arr.length-1){
                System.out.print(arr[i] + (counter+1));
            }

        }


    }
}
