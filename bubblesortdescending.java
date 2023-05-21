public class BubbleSortDescending {
    public static void main(String[] args) {
        String[] data = {"Semarang", "Malang", "Jakarta", "Cianjur", "Bogor", "Denpasar"};
        System.out.println("Data sebelum diurutkan:");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
        bubbleSortDescending(data);
        System.out.println("Data setelah diurutkan secara descending:");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }

    public static void bubbleSortDescending(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) < 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}