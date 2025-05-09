public class Cinderella_Array_Problem {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {4, 3, 2, 1};

        if (areArraysSame(array1, array2)) {
            System.out.println("The arrays are the same.");
        } else {
            System.out.println("The arrays are not the same.");
        }
    }

    public static boolean areArraysSame(int[] arr1, int[] arr2) {
        // Check if lengths are the same
        if (arr1.length != arr2.length) {
            return false;
        }

        // Calculate the sum of both arrays
        int sum1 = 0, sum2 = 0;
        for (int num : arr1) {
            sum1 += num;
        }
        for (int num : arr2) {
            sum2 += num;
        }

        // Check if sums are the same
        if (sum1 == sum2) {
            System.out.println("Array 1: " + java.util.Arrays.toString(arr1));
            System.out.println("Array 2: " + java.util.Arrays.toString(arr2));
            return true;
        } else {
            System.out.println("Array 1: " + java.util.Arrays.toString(arr1));
            System.out.println("Array 2: " + java.util.Arrays.toString(arr2));
            return false;
        }

    }
}