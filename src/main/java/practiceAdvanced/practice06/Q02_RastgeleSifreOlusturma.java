package practiceAdvanced.practice06;

public class Q02_RastgeleSifreOlusturma {

    public static void main(String[] args) {

        // Kullanıcıdan aldığınız sayi kadar karakter uzunluğuna sahip rastgele şifre üreten bir kod yazınız.

        int s = 5;
        String pwd = "";
        String character = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int maxIndex = character.length();
        int count = 0;

        while (count<s){
            int randomIndex = (int)(Math.random()*maxIndex);
            pwd += character.charAt(randomIndex);
            count++;
        }

        System.out.println("password is: " + pwd);



    }
}
