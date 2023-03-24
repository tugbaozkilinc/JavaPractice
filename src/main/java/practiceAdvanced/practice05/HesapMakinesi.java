package practiceAdvanced.practice05;

public class HesapMakinesi {


    public void add(double... a){
        int sum = 0;

        for (double w : a){
            sum += w;
        }
        System.out.println(sum);
    }

    public void subtraction(double a, double b){
        System.out.println(a-b);
    }

    public void multiplication(double... a){
        int multiply = 1;

        for (double w : a){
            multiply *= w;
        }
        System.out.println(multiply);
    }

    public void division(double a, double b){
        if (b==0){
            System.out.println("Bolen sayi 0 olamaz");
        } else
            System.out.println(a/b);
    }


}
