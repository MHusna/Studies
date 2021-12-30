#include<stdio.h>

int main(){
	int counter = 1 , result, passCounter = 0, failCounter = 0;
	
	while(counter <= 10){
		printf("Enter the result: ");
		scanf("%d",&result);
		counter = counter + 1;
		if(result == 1)
			passCounter++;
		else
			failCounter++;
	}
	
	printf("\nNumber of pass: %d",passCounter);
	printf("\nNumber of fail: %d",failCounter);
	
	if(passCounter >= 8)
		printf("\nCongrats ! Your class has high success.");
}
