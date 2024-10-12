#include <stdio.h>

void findLocalMaxima(int arr[], int size) {
    if (size < 2) return;
    
    // First element
    if (arr[0] > arr[1]) {
        printf("%d ", arr[0]);
    }
    
    // Middle elements
    for (int i = 1; i < size - 1; i++) {
        if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
            printf("%d ", arr[i]);
        }
    }
    
    // Last element
    if (arr[size - 1] > arr[size - 2]) {
        printf("%d", arr[size - 1]);
    }
    printf("\n");
}

int main() {
    int arr[] = {2, 5, 7, 8, 4, 3, 5, 9, 4, 6, 8};
    int size = sizeof(arr) / sizeof(arr[0]);
    findLocalMaxima(arr, size);
    return 0;
}
