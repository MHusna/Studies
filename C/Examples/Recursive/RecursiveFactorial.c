#include<stdio.h>

int factorial(int);

int main(){

    int entry = 0, result = 0;

    printf("Enter the number: "); scanf("%d",&entry);
    result = factorial(entry);

    printf("Result: %d\n5",result);

    return 0;
}

int factorial(int number){

    if(number <= 1)
        return 1;
    else
        return (number * factorial(number - 1));

}