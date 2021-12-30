#include<stdio.h>

int main(){
	
	int number;
	
	printf("Give number: ");
	scanf("%d",&number);
	
	if(number % 2 == 0)
		printf("%d is even.",number);
	
	if(number % 2 == 1)
		printf("%d is odd.",number);
}
