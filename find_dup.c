#include <stdio.h>

void dup(int arr[], int size) {
    printf("Duplicate elements are: ");
    for (int i = 0; i < size; i++) {
        for (int j = i + 1; j < size; j++) {
            if (arr[i] == arr[j]) {
                printf("%d ", arr[i]);
                break; 
            }
        }
    }
    printf("\n");
}

int main() {
    int arr[] = {1, 2, 3, 4, 2, 5, 3, 6, 1}; 
    int size = sizeof(arr) / sizeof(arr[0]); 
    dup(arr, size);

    return 0;
}
