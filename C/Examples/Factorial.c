#include<stdio.h>

int main(){
	
	int number, result = 1;
	
	printf("Enter the number: "); scanf("%d",&number);
	
	while(number > 1 ){
		
		result *= number;
		number--;
	}
	
	printf("Result: %d",result);
}
