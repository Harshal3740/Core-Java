import java.util.*;

class SubtractTwoMatrix{
	public static void InputData(int arr[][],Scanner scanner){
		for (int i=0; i<arr.length;i++) {
			for (int j=0;j<arr.length;j++) {
				System.out.print("Enter Element [ "+i+" ] [ "+j+" ] : ");
				arr[i][j] = scanner.nextInt();
			}
			System.out.println();
		}
	}	

	public static void DisplayArray(int arr[][]) {
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
                result[i][j] = arr1[i][j] - arr2[i][j];
            }
        }

        return result;
    }


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		int arr1[][] = new int[3][3];
		int arr2[][] = new int[3][3];

		System.out.println("Enter the First Element of an Array : ");
		InputData(arr1,scanner);
		System.out.println("Enter the Second Element of an Array : ");
		InputData(arr2,scanner);

		System.out.println("Display First Array : ");
		DisplayArray(arr1);
		System.out.println("Display Second Array : ");
		DisplayArray(arr2);

		int result[][] = addMatrices(arr1,arr2);

		System.out.println("Display Subtraction of First and Second Array : ");
		DisplayArray(result);
}}