#include<stdio.h>

int main(){
	
	int line, column, size;
	
	printf("Enter the size of design: "); scanf("%d",&size);
	
	for(line = 1; line <= size; line++){
		for(column = 1; column <= line; column++){
			printf("*");
		}
		printf("\n");
	}
}
