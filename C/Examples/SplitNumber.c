#include<stdio.h>

int main(){
	
	int number, digit1, digit2, digit3, digit4, digit5, counter;
	
	printf("Give number: ");
	scanf("%d",&number);
	
	counter = 0;
	if(number > 0){
		digit1 = number % 10;
		number = number - digit1;
		number = number / 10;
		counter++;
	}
	
	if(number > 0){
		digit2 = number % 10;
		number = number - digit2;
		number = number / 10;
		counter++;
	}
	
	if(number > 0){
		digit3 = number % 10;
		number = number - digit3;
		number = number / 10;
		counter++;
	}
	
	if(number > 0){
		digit4 = number % 10;
		number = number - digit4;
		number = number / 10;
		counter++;
	}
	
	if(number > 0){
		digit5 = number % 10;
		number = number - digit5;
		number = number / 10;
		counter++;
	}
	
	printf("%d   ",digit5);
	printf("%d   ",digit4);
	printf("%d   ",digit3);
	printf("%d   ",digit2);
	printf("%d   ",digit1);
}
