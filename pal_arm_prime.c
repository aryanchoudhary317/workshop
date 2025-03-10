#include <stdio.h>
#include <math.h>


int isArmstrong(int num) {
    int original = num, sum = 0, digits = 0;

    while (num != 0) {
    	
                digits++;
        num /= 10;
    }

    num = original;
    while (num != 0) 
	
               	{
        int remainder = num % 10;
        sum += pow(remainder, digits);
        num /= 10;
    }

    return sum == original;
}


int isPrime(int num) {
    if (num <= 1) return 0;
                  for (int i = 2; i <= sqrt(num); i++) {
                               if (num % i == 0) return 0;
    }
    return 1;
}


int isPalindrome(int num) {
    int original = num, reversed = 0;

    while (num != 0) {
        reversed = reversed * 10 + num % 10;
        num /= 10;
    }

    return reversed == original;
}

int main() {
    int size;

  
    printf("Enter the number of elements in the array: ");
    scanf("%d", &size);

    int arr[size];

    printf("Enter %d elements:\n", size);
    for (int i = 0; i < size; i++) {
        scanf("%d", &arr[i]);
    }

    printf("\nArmstrong numbers: ");
    for (int i = 0; i < size; i++) {
        if (isArmstrong(arr[i])) {
            printf("%d ", arr[i]);
        }
    }

    printf("\nPrime numbers: ");
    for (int i = 0; i < size; i++) {
        if (isPrime(arr[i])) {
            printf("%d ", arr[i]);
        }
    }
 printf("\nPalindrome numbers: ");
    for (int i = 0; i < size; i++) {
        if (isPalindrome(arr[i])) {
            printf("%d ", arr[i]);
        }
    }

    return 0;
}
