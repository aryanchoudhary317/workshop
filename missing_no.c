#include <stdio.h>

int main() {
    int arr[] = {1, 2, 3, 5, 6, 7, 8, 9};
    int n = 9;
    int aa = n * (n + 1) / 2; 
    int Sum = 0;

  
    for (int i = 0; i < 8; i++) {
        Sum += arr[i];
    }

    int num = aa - Sum; 
    printf("The missing number is: %d", num);

    return 0;
}

