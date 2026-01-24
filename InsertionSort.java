import java.util.Scanner;

public class InsertionSort {
    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array:----> ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:---->");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        sort(array);

        System.out.println("Sorted array:---->");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
