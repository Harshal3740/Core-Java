import java.util.*;

class AddTwoArray {

    public static void inputArray(int arr[][], Scanner scanner) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter Element [" + i + "][" + j + "] : ");
                arr[i][j] = scanner.nextInt();
            }
        }
    }

    public static void displayArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] addMatrices(int arr1[][], int arr2[][]) {
        int result[][] = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int arr1[][] = new int[3][3];
        int arr2[][] = new int[3][3];

        System.out.println("Enter First Matrix:");
        inputArray(arr1, scanner);

        System.out.println("Enter Second Matrix:");
        inputArray(arr2, scanner);

        int result[][] = addMatrices(arr1, arr2);

        System.out.println("\nFirst Matrix:");
        displayArray(arr1);

        System.out.println("\nSecond Matrix:");
        displayArray(arr2);

        System.out.println("\nSum of Matrices:");
        displayArray(result);

        scanner.close();
    }
}