package practiceAdvanced.practice10;

public class Q02_Faktoriyel_LoopKullanmadan {

    public static void main(String[] args) throws Exception {

        System.out.println(factorial(6));


    }

    public static int factorial(int s) throws Exception {

        if(s>0){
            if(s==1){ // Bu condition sana duracagin yeri soyler, yazmazsan exception atar. s==4 --> 30(4 icin bir return ederek carpmaya dahil eder), s==3 --> 120
                return 1;
            } else {
                return s*factorial(s-1);
            }
        } else {
            throw new Exception("Sayi 0 dan buyuk olmali");
        }

    }





}
