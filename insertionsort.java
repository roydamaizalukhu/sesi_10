public class InsertionSort {
    public static void main(String[] args) {
        int[] data = {5, 2, 4, 6, 1, 3};
        System.out.println("Data sebelum diurutkan:");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
        insertionSort(data);
        System.out.println("Data setelah diurutkan:");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }

    public static void insertionSort(int[] arr) {
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
}