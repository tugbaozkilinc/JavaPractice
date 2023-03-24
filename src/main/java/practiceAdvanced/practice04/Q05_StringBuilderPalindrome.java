package practiceAdvanced.practice04;

public class Q05_StringBuilderPalindrome {

    public static void main(String[] args) {

        // Bir String değerin Palindrome olup olmadığını kontrol eden bir kod yazınız.

        // 1. yol:
        String str = "Nazan";
        String strReverse = "";

        for(int i=str.length()-1; i>-1; i--){
            strReverse += str.charAt(i);
        }

        if(str.equalsIgnoreCase(strReverse)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Palindrome degil");
        }

        // 2. yol:
        String s = "Nazan";
        StringBuilder stb = new StringBuilder(s);
        String stbReverse = stb.reverse().toString(); // String.valueOf(stb.reverse())

        if (s.equalsIgnoreCase(stbReverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Palindrome degil");
        }


    }
}
