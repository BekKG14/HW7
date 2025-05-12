import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int[] arr = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(arr));
        double[] arr1 = new double[]{1.58, 7.654, 9.986};
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = new int[]{3, 2, 1};
        System.out.println(Arrays.toString(arr2));
        // Задание 2
        System.out.println("Задание 2");
        for (int i = 0; i < arr.length; i++) {
            if (i + 1 < arr.length) {
                System.out.printf(arr[i] + ", ");
            } else {
                System.out.println(arr[i]);
            }
        }
        for (int i = 0; i < arr1.length - 1; i++) {
            if (i < arr1.length) {
                System.out.printf(arr1[i] + ", ");
            } else {
                System.out.println(arr1[i]);
            }
        }
        System.out.println(arr1[2]);
        for (int i = 0; i < arr2.length; i++) {
            if (i + 1 < arr2.length) {
                System.out.printf(arr2[i] + ", ");
            } else {
                System.out.println(arr2[i]);
            }
        }
        // Задание 3
        System.out.println("Задание 3");
        for(int i = arr.length - 1 ; i >= 0; i--) {
            if (i > 0) {
                System.out.printf(arr[i] + ", ");
            }else{
                System.out.println(arr[i]);
            }
        }
        for(int i = arr1.length - 1 ; i >= 0; i--) {
            if (i > 0) {
                System.out.printf(arr1[i] + ", ");
            }else{
                System.out.println(arr1[i]);
            }
        }
        for(int i = arr2.length - 1 ; i >= 0; i--) {
            if (i > 0) {
                System.out.printf(arr2[i] + ", ");
            }else{
                System.out.println(arr2[i]);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = arr[i] + 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}