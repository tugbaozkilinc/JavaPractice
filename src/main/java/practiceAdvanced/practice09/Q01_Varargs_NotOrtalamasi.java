package practiceAdvanced.practice09;

public class Q01_Varargs_NotOrtalamasi {

    public static void main(String[] args) {

        // 4 öğrencinin not ortalamasını sırasıyla 6, 4, 3 ve 5 sınav olacak şekilde hesaplayan bir method yazınız.

        calculateAverage("Ali", 96.9, 96.7, 100, 100, 96, 95);
        calculateAverage("Ayse", 99, 90, 100, 100);
        calculateAverage("Fatma", 99, 90, 100);
        calculateAverage("Hayriye", 99, 90, 100, 99, 85);


    }

    public static void calculateAverage(String name, double... a){

        double sum = 0;
        for(double w : a){
            sum += w;
        }
        String average = String.format("%.3f", sum/a.length);
        System.out.println("The grade average of " + name + " is: " + average);

    }




}
