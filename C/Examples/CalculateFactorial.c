#include<stdio.h>

int main(){
	
	int number, counter = 1, multiply;
	
	for(number = 1; number <= 20; number++){
		
		multiply = 1;
		counter = 1;
		while(counter <= number){
			
			if(counter != number){
				printf("%d x ",counter);	
			}
			else{
				printf("%d: ",counter);
			}
			multiply *= counter;
			counter++;
		}
		printf("%d",multiply);
		printf("\n");
	}
}
