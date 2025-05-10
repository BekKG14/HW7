import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(Arrays.toString(arr));
        double[] arr1 = new double[3];
        arr1[0] = 1.58;
        arr1[1] = 7.654;
        arr1[2] = 9.986;
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = {3, 2, 1};
        System.out.println(Arrays.toString(arr2));
        // Задание 2
        System.out.println("Задание 2");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.printf(arr[i] + ", ");
        }
        System.out.println(arr[2]);
        for (int i = 0; i < arr1.length - 1; i++) {
            System.out.printf(arr1[i] + ", ");
        }
        System.out.println(arr1[2]);
        for (int i = 0; i < arr2.length - 1; i++) {
            System.out.printf(arr2[i] + ", ");
        }
        System.out.println(arr2[2]);
        // Задание 3
        System.out.println("Задание 3");
        for (int i = 2; i > 0; i--) {
            System.out.printf(arr[i] + ", ");
        }
        System.out.println(arr[0]);
        for (int i = 2; i > 0; i--) {
            System.out.printf(arr1[i] + ", ");
        }
        System.out.println(arr1[0]);
        for (int i = 2; i > 0; i--) {
            System.out.printf(arr2[i] + ", ");

        }
        System.out.println(arr2[0]);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = arr[i] + 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}