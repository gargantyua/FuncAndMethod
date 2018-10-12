package main;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Заполнить двумерный массив рандомом. вывести числа которые кратны двум. отрицательные числа возвести в квадрат. вывести массив.
 */
public class Main {

    public static void main(String[] args) {

        List<Integer> array = inputArray(30);

        System.out.print("Список рандомных чисел: ");
        outputArray(array);

        System.out.print("Числа кратные двум: ");
        outputArray(getMultipleNumbers(array));

        System.out.print("Отрицательные числа в квадрате: ");
        outputArray(getNegativeNumbers(array));
    }

    //заполнение массива
    private static List<Integer> inputArray(int capacity) {
        return IntStream.generate(() -> (int) ((Math.random() * 99) - 50)).limit(capacity).boxed().collect(Collectors.toList());
    }

    //вывод чисел кратные двум
    private static List<Integer> getMultipleNumbers(List<Integer> array) {
        return array.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
    }

    //отрицательные числа возводим в квадрат
    private static List<Integer> getNegativeNumbers(List<Integer> array) {
        return array.stream().filter(n -> n < 0).map(n -> n *= n).collect(Collectors.toList());
    }

    //вывод массива
    private static void outputArray(List<Integer> array) {
        array.forEach(integer -> System.out.print(integer + " "));
        System.out.println();
    }
}
