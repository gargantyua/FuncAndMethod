package main;

//заполнить двумерный массив рандомом. вывести числа которые кратны двум. отрицательные числа возвести в квадрат. вывести массив.

public class Main {

    public static void main(String[] args) {

        int[][] array = inputArray();

        getMultipleNumbers(array);
        getNegativeNumbers(array);
        outputArray(array);

    }

    //заполнение массива
    private static int[][] inputArray() {

        int[][] array = new int[4][4];

        System.out.print("Ваш массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) ((Math.random() * 99) - 50);
                System.out.print(array[i][j] + " ");
            }
        }
        return array;
    }

    //вывод чисел кратные двум
    private static void getMultipleNumbers(int[][] array) {
        System.out.println();
        System.out.println("Числа кратные двум: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
    }

    //отрицательные числа возводим в квадрат
    private static void getNegativeNumbers(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j] < 0){
                    array[i][j] *= array[i][j];
                }
            }
        }
    }

    //вывод массива
    private static void outputArray(int[][] array) {
        System.out.println();
        System.out.print("Новый массив: ");
        for (int i = 0; i < array.length; i++){
            System.out.println();
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
        }
    }

}
