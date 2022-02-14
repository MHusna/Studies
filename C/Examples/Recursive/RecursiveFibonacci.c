#include<stdio.h>

//int calculateFibonacci(int);

int main(){
    int sum, entry;
 
    printf("Enter the number: "); scanf("%d",&entry);
    sum = calculateFibonacci(entry);

    printf("Fibonacci(%d): %d\n",entry, sum);
}

int calculateFibonacci(int entry){

    if(entry == 0 || entry == 1)
        return entry;

    else
        return(calculateFibonacci(entry-1) + calculateFibonacci(entry-2));
}



