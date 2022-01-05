#include<stdio.h>

int main(){
	
	int smallest, number;
	
	printf("Enter the number(EOF for exit): "); scanf("%d",&number);
	smallest = number;
	
	while(number != EOF){
		
		if(number <= smallest){
			smallest = number;
		}
		printf("Enter the number(EOF for exit): "); scanf("%d",&number);
	}
	
	printf("Smallest: %d",smallest);
}
