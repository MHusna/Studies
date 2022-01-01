#include<stdio.h>

int main(){
	
	int number, counter = 1, biggest = 0;
	
	while(counter <= 10){
		printf("Enter the number: "); scanf("%d",&number);
		
		if(biggest <= number)
			biggest = number;
		
		counter++;
	}
	
	printf("The biggest: %d",biggest);
}
