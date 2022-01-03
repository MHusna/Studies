#include<stdio.h>

int main(){
	
	int line = 0, size, counter = 0;

	printf("Size of Square: "); scanf("%d",&size);
	
	while(line <= size){
		
			if(line == 0 | line == size){
			counter = 0;
		
			while(counter <= size - 1){
				printf("*");
				counter++;
			}
			printf("\n");
		}
		
		else{
		
			printf("*");
			counter = 0;
			while(counter < size - 2){
				printf(" ");
				counter++;
			}
			printf("*\n");
		}
		
		line++;	
	}
	
	
	
}
