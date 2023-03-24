package practiceAdvanced.practice10;

public class Q04_Random_AdOlusturma {

    public static void main(String[] args) {

        // Rastgele alınan harfleri bir String e ekleyerek adınızı oluşturan ve bunu kaç deneme ile yaptığını yazdıran bir kod yazınız.

        String characters="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int maxIndex = characters.length();
        String name = "Ali";
        String result = "";
        int counter = 0;

        for (int i = 0; i<name.length(); i++){
            while (true){
                char ch = characters.charAt((int)(Math.random()*maxIndex));
                counter++;
                if(name.charAt(i)==ch){
                    result += ch;
                    break;
                }
            }
        }

        System.out.println(result);
        System.out.println(counter);





    }
}
