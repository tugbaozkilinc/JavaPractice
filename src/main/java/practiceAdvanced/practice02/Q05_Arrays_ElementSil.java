package practiceAdvanced.practice02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q05_Arrays_ElementSil {

    public static void main(String[] args) {

        // Example 1: Elementlerini kullanıcidan alarak bir integer Array oluşturunuz. Kullanıcıdan bir indeks alınız ve o index teki elementi siliniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Array in length ini giriniz");
        int limit = input.nextInt();
        int[] arr = new int[limit];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + ". index in elemanini giriniz");
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        // 1. Yol
        System.out.println("Silmek istediginiz elementin index ini giriniz");
        int removeIndex = input.nextInt();
        int idx = 0;
        int[] brr = new int[limit - 1];
        for (int i = 0; i < arr.length; i++) {
            if (removeIndex != i) {
                brr[idx] = arr[i];
                idx++;
            }
        }
        System.out.println(Arrays.toString(brr));

        // 2. Yol
        List<Integer> numberList = new ArrayList<>();
        for (int w : arr) {
            numberList.add(w);
        }
        System.out.println("Silmek istediğiniz elementin index ini giriniz.");
        int silinecekIdx = input.nextInt();
        numberList.remove(silinecekIdx);
        System.out.println(numberList);
        // System.out.println("Silmek istediğiniz elementi giriniz");
        // numberList.remove(numberList.indexOf(input.nextInt()));
        // System.out.println(numberList);

        // 3. Yol
        List<Integer> list = new ArrayList<>();
        for (int w : arr) {
            list.add(w);
        }
        for (int m = 0; m < list.size(); m++) {
            System.out.println("Silmek istediginiz element in index ini giriniz\nSilme islemini dudurmak icin 'x' e basiniz");
            String idxOfRemove = input.next();
            if (idxOfRemove.equals("x")) {
                break;
            }
            list.remove(Integer.parseInt(idxOfRemove));
            m--;
            System.out.println(list);
        }
        System.out.println(list);



    }
}


