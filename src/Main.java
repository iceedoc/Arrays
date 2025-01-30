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
        System.out.println(numbers[2] + "," + numbers[1] + "," + numbers[0]);
        System.out.println(doubleArray[2] + ";" + doubleArray[1] + "," + doubleArray[0]);
        System.out.println(arbitrarily[2] + "," + arbitrarily[1] + "," + arbitrarily[0]);
        System.out.println("\nTask 4");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] += 1;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}

