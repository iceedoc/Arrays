import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Массивы");
        System.out.println("\nTask 1");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        double[] doubleArray = {1.57, 7.654, 9.986};
        int[] arbitrarily = {10, 11, 12};
        System.out.println();
        System.out.println("\nTask 2");
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(doubleArray));
        System.out.println(Arrays.toString(arbitrarily));
        System.out.println("\nTask 3");
        int[] numbers1 = {1, 2, 3};
        double[] doubleArray1 = {1.57, 7.654, 9.986};
        for (int i = numbers1.length - 1; i >= 0; i--) {
            System.out.print(numbers1[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = doubleArray1.length - 1; i >= 0; i--) {
            System.out.print(doubleArray[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }

        System.out.println("\nTask 4");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] += 1;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}



