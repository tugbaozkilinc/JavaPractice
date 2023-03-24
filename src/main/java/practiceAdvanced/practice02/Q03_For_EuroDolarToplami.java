package practiceAdvanced.practice02;

import java.util.Arrays;

public class Q03_For_EuroDolarToplami {

    public static void main(String[] args) {

        // Example 1: Tek bir String içerisinde verilen euro ve dolarların ayrı ayrı toplamlarıni bulan bir kod yazınız. String str ="$1 $12 €34 €56 $45 €78";

        String str ="$1 $12 €34 €56 $45 €78";
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));
        int dollarSum = 0;
        int euroSum = 0;

        for(String w : arr){
            if(w.contains("$")){
                dollarSum += Integer.parseInt(w.replace("$",""));
            }else {
                euroSum += Integer.parseInt(w.replace("€",""));
            }
        }
        System.out.println("Dollar sum is: " + dollarSum + "$");
        System.out.println("Euro sum is: " + euroSum + "€");
    }


}

