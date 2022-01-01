#include<stdio.h>

int main(){
	
	int counter = 1, number, secondBiggest = 0, biggest = 1, temp;
	
	while(counter <= 10){
		printf("Enter the number: "); scanf("%d",&number);
		
		if(secondBiggest <= number){
			secondBiggest = number;
			
			if(secondBiggest > biggest){
				temp = biggest;
				biggest = secondBiggest;
				secondBiggest = temp;
			}
		}
		
		counter++;
	}
	
	printf("Biggest: %d",biggest);
	printf("\nSecond biggest: %d",secondBiggest);
}
