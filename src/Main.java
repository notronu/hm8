import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1,2");
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();

        double[] number = {1.57, 7.654, 9.986};
        number[0] = 1.57;
        number[1] = 7.654;
        number[2] = 9.986;
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + ",");
        }
        System.out.println();

        int[] aff = {12, 24, 30, 47};
        aff[0] = 12;
        aff[1] = 24;
        aff[2] = 30;
        aff[3] = 47;
        for (int i = 0; i < aff.length; i++) {
            System.out.print(aff[i] + ",");
        }
        System.out.println();

        System.out.println("Задача 3");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print(number[i] + ",");
        }
        System.out.println();
        for (int i = aff.length - 1; i >= 0; i--) {
            System.out.print(aff[i] + ",");
        }
        System.out.println();

        System.out.println("Задача 4");
        int[] arr1 = {1, 2, 3};
        for (int i = 0; i < 3; i++) {
            if (arr1[i] % 2 != 0) {
                arr1[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arr1));


    }
}