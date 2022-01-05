#include<stdio.h>

int main(){
	
	int size, counter = 1, sum = 0, number;
	
	printf("Enter the size: "); scanf("%d",&size);
	
		do{
		printf("Enter the number: "); scanf("%d",&number);
		sum += number;
		counter++;
	}while(counter <= size);
	
	printf("Total: %d",sum);
}
