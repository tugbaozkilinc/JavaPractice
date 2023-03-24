package practiceAdvanced.practice07;

public class Q01_ArrayToStringNegative {

    public static void main(String[] args) {

        /*
          Array olarak verilen bir cümleyi String olarak negatif anlamıyla yazdıran bir kod yazınız.
          Input:
          String[] arr={"J","a","v","a","I","s","D","i","f","f","i","c","u","l","t"};
          Output:
          String output ="JavaIsNOTDifficult";
        */

        String[] arr = {"J","a","v","a","I","s","D","i","f","f","i","c","u","l","t"};
        String result = "";

        for (String w : arr){
            result += w;
        }

        System.out.println(result);

        result = result.replace("Is", "IsNOT");
        System.out.println(result);





    }
}
