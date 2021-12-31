#include<stdio.h>

int main(){
	
	int base, pow, counter = 1, temp = 1;
	
	printf("Base: ");
	scanf("%d",&base);
	
	printf("Pow: ");
	scanf("%d",&pow);
	
	while(counter <= pow){
		
		temp *= base;
		counter++;
	}
	
	printf("\nResult: %d",temp);
}
