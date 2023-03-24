package practiceAdvanced.practice10;

public class Q05_Varargs_IlkiHaricTopla {

    public static void main(String[] args) {

        // Parametrelerinin ilki hariç  karakter sayılarını toplayan ve bu toplamı birinci parametrenin karakter sayısıyla çarpan bir method yazınız.
        // (indeks ve if statement kullanmayınız)

        myMethod("Ali", "Veli", "Sally", "Polly");


    }

    public static void myMethod(String a, String... b){

        int sum = 0;
        for(String w : b){
            sum += w.length();
        }
        System.out.println(sum*a.length());

    }



}
