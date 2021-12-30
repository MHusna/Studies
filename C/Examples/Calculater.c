#include<stdio.h>

int main(){
	
	int number1, number2, number3, result;
	int smallest, biggest;
	
	printf("Give 3 numbers: ");
	scanf("%d %d %d",&number1, &number2, &number3);
	
	result = number1 + number2 + number3;
	printf("\nSum: %d",result);
	
	result = (result / 3);
	printf("\nAverage: %d",result);
	
	result = number1 * number2 * number3;
	printf("\nMultiply: %d",result);
	
	
	smallest = number1;
	
	if(number2 < smallest)
		smallest = number2;
	
	if(number3 < smallest)
		smallest = number3;
	
	printf("\nSmallest: %d",smallest);
	
	biggest = number1;
	
	if(number2 > biggest)
		biggest = number2;
	
	if(number3 > biggest)
		biggest = number3; 
	
	printf("\nBiggest: %d",biggest);
}
