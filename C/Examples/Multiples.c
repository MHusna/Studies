#include<stdio.h>

int main(){
	int number1, number2;
	
	printf("Number 1: ");
	scanf("%d",&number1);
	
	printf("Number 2: ");
	scanf("%d",&number2);
	
	if(number2 % number1 == 0)
		printf("%d is multiples of %d.", number1, number2);
	
	if(number2 % number1 != 0)
		printf("%d is not multiples of %d.", number1, number2);
}
