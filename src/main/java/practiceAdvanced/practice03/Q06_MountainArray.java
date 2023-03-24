package practiceAdvanced.practice03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q06_MountainArray {

    public static void main(String[] args) {

        /*
          Bir Array'in Mountain Array olup olmadığını kontrol eden bir kod yazınız.
          Mountain Array: Element değerleri bir noktaya kadar sürekli artıp o noktadan sonra sürekli azalan Array.
        */

        int[] arr = {-999, 1, 2, 5, 7, 9, 22, 8, 3, 1, -100};
        List<Integer> list = new ArrayList<>();
        for (int w : arr){
            list.add(w);
        }

        int max = arr[0];
        for (int w : arr){
            if (w>max){
                max = w;
            }
        }

        List<Integer> list1 = new ArrayList<>();
        for (int w : list){
            if (w==max){
                break;
            }
            list1.add(w);
        }
        System.out.println("list1: " + list1);

        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i<list.size(); i++){
            if (i<list.indexOf(max)){
                continue;
            }
            list2.add(arr[i]);
        }
        System.out.println("list2: " + list2);

        List<Integer> list1Copy = new ArrayList<>(list1); // list1Copy.addAll(list1);
        List<Integer> list2Copy = new ArrayList<>(list2); // list2Copy.addAll(list2);
        Collections.sort(list1Copy);
        Collections.sort(list2Copy);
        Collections.reverse(list2Copy);

        if (list1.equals(list1Copy) && list2.equals(list2Copy)){
            System.out.println("Mountain Array");
        } else {
            System.out.println("Not Mountain Array");
        }



    }
}
