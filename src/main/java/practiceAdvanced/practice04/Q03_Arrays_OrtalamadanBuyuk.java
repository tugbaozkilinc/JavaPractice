package practiceAdvanced.practice04;

public class Q03_Arrays_OrtalamadanBuyuk {

    public static void main(String[] args) {

        // Elementlerin ortalamasından büyük elementleri yazdıran bir kod yazınız.

        int[] arr = {5, 9, 15, 1, 0, 11, 3};
        int sum = 0;

        for (int w : arr){
            sum += w;
        }
        int average = sum/arr.length;
        System.out.println("Average is: " + average);

        for (int w : arr){
            if (w>average){
                System.out.print(w + " ");
            }
        }


    }
}
