public class LocalMaxima {
    public static void findLocalMaxima(int[] arr) {
        int n = arr.length;

        // First element
        if (n > 1 && arr[0] > arr[1]) {
            System.out.print(arr[0] + " ");
        }

        // Middle elements
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                System.out.print(arr[i] + " ");
            }
        }

        // Last element
        if (n > 1 && arr[n - 1] > arr[n - 2]) {
            System.out.print(arr[n - 1]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 8, 4, 3, 5, 9, 4, 6, 8};
        findLocalMaxima(arr);
    }
}
