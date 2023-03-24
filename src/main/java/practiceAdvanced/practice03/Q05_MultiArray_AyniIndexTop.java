package practiceAdvanced.practice03;

public class Q05_MultiArray_AyniIndexTop {

    public static void main(String[] args) {

        /*
          Aşağıdaki mutli dimensional array'lerin iç array'lerinde aynı indexe sahip elamanların toplamını yazdıran bir program yazın.
          int arr1[][] = {{1, 2}, {3, 4, 5}, {6}};
          int arr2[][] = {{7, 8, 9}, {10, 11}, {12}};
        */

        int arr1[][] ={{1, 2}, {3, 4, 5}, {6}};
        int arr2[][] ={{7, 8, 9}, {10, 11}, {12}};

        int limit = 0;
        int sum = 0;

        for (int i = 0; i< arr1.length; i++){
            limit = arr1[i].length;
            if (arr1[i].length> arr2[i].length){
                limit = arr2[i].length;
            }
            for (int j = 0; j<limit; j++){
                sum = arr1[i][j] + arr2[i][j];
                System.out.println(sum);
            }
        }



    }
}
