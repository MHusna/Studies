#include<stdio.h>

int main(){
	
	int number1, number2;
	
	printf("First Number: ");
	scanf("%d",&number1);

	printf("Second Number: ");
	scanf("%d",&number2);
	
	if(number1 > number2)	
		printf("%d is bigger.",number1);
	
	if(number1 < number2)
		printf("%d is bigger.",number2);
	
	if(number1 == number2)
		printf("First number(%d) is equal second number(%d).",number1, number2);
}
