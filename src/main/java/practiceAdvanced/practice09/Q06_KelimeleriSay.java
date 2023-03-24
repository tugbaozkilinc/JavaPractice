package practiceAdvanced.practice09;

import java.util.HashMap;
import java.util.Map;

public class Q06_KelimeleriSay {

    public static void main(String[] args) {

    /*
      Bir String içerisindeki kelimelerin kaç kez tekrar ettiğini bulan bir method yazınız.
      input: "Ali okula geldi ve Ayse de okula geldi."
      output: Ali=1, okula=2, geldi=2, ve=1, Ayse=1, de=1
    */

        String str = "   Ali,   okula   geldi .....,,,,, ve   Ayse   de okula geldi.   ";

        kelimeleriSay(str);

    }

    public static void kelimeleriSay(String str){

        String yeniString = str.replaceAll("\\p{Punct}", "").replaceAll("\\s+", " ").trim(); // "\\s+" --> 1 ya da daha fazla anlamına gelir.
        System.out.println(str);
        System.out.println(yeniString);
        String[] arr = yeniString.split(" ");
        Map<String,Integer> map = new HashMap<>();
        for(String w : arr){
            if(!map.containsKey(w)){
                map.put(w, 1);
            } else {
                map.put(w, map.get(w)+1);
            }
        }
        System.out.println(map);



    }

}
