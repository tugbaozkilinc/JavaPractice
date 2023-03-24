package practiceAdvanced.practice10;

import java.time.LocalTime;

public class Q06_HizTesti {

    public static void main(String[] args) {

        // İki java işlemi arasındaki çalışma zamanı farkını gösteren bir kod yazınız.

        long nano1 = LocalTime.now().getNano();

        int x = 0;
        while (x<2000000000){
            int a = 1234*1234;
            x++;
        }
        long nano2 = LocalTime.now().getNano();

        System.out.println(nano2);
        System.out.println(nano1);
        System.out.println(nano2-nano1);





    }
}
