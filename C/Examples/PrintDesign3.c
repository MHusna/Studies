#include<stdio.h>

int main(){
	
	int line, column, size;
	
	printf("Enter the size of design: "); scanf("%d",&size);
		
	for(line = size; line >= 1; line--){
		for(column = line; column >= 1; column--){
			printf("*");
		}
		printf("\n");
	}	
	
}
