package cycles;

//Дан массив {1,2,3,4,5}. Используя for вывести в обратном порядке.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {
    public static void main(String[] args) {
        ArrayList<Object> arr = new ArrayList<>();
        arr.add("1");
        arr.add("2");
        arr.add("3");
        arr.add("4");
        arr.add("5");

        System.out.println(arr);
        Collections.reverse(arr);
        System.out.println(arr);

        int[] list = {2, 4, 6, 8, 10};
        System.out.println(Arrays.toString(list));

        for (int i = list.length - 1; i >= 0; i--) {
            System.out.print(list[i] + ",");
        }
        System.out.println();
    }
}
