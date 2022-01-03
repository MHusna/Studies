#include<stdio.h>

int main(){
	
	int number, digit, counter = 0;
	
	printf("Enter the number: "); scanf("%d",&number);
	
	while(number > 0){
		digit  = number % 10;
		number -= digit;
		number /= 10;
		
		if(digit % 7 == 0){
			counter++;
		}
	}
	
	printf("Mutliples of seven: %d",counter);
}
