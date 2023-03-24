package practiceAdvanced.practice07;

import java.util.ArrayList;
import java.util.List;

public class Q02_UzunKelime {

    public static void main(String[] args) {

        //  Kullanıcıdan alınan cümledeki en uzun kelimeyi(kelimeleri) return eden bir method oluşturunuz.

        String s = "Java is easy";
        System.out.println(theLongestWord(s));

    }

    public static List<String> theLongestWord(String statement){

        List<String> list = new ArrayList<>();
        String arr[] = statement.split(" ");
        int max = 0;

        for (String w : arr){
            max = Math.max(w.length(), max);
        }

        for (String w : arr){
            if (w.length()==max){
                list.add(w);
            }
        }
        return list;

    }



}
