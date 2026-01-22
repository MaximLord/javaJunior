package cycles;

//Массив {1,2,2,3,3,4}. Используя Arrays и циклы найти уникальные элементы.

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueArray {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 5, 3, 4, 6, 2};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1])
                count++;
        }
        System.out.println(count);
    }
}
