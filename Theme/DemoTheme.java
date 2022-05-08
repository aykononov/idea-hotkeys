package Theme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jdk.jfr.Timestamp;

/**
 * Демонстрация темы в стиле Visual Studio Code
 */

// TODO - для примера
public class DemoTheme {

    private static List<Integer> arrayList = new ArrayList<>();

    @Timestamp // Timestamp - для примера
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};

        for (int i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
        }

        System.out.println("Вывод массивов:");
        System.out.println(Arrays.toString(array) + "\n" + arrayList.toString());
    }
}
