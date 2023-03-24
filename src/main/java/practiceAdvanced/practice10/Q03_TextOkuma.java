package practiceAdvanced.practice10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Q03_TextOkuma {

    public static void main(String[] args) throws IOException {

        // Bir text dosyasindaki 3. satirin kelime sayisini veren bir kod yaziniz.

        BufferedReader file = new BufferedReader(new FileReader("src\\main\\java\\practiceAdvanced\\practice10\\File.text"));
        file.readLine();
        file.readLine();
        String line3 = file.readLine();
        System.out.println(line3);
        String arr[] = line3.split(" ");
        System.out.println(arr.length);

        // Son satiri okutmak icindir.
        String line = null;
        while (file.readLine() != null) {
            line = file.readLine();
        }
        System.out.println(line);




    }
}
