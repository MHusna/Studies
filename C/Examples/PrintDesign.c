#include<stdio.h>

int main(){
	
	int number = 8, counter = 1, temp;
	
	
	while(counter <= number){
		
		if(counter % 2 == 1){
			temp = 0;
			while(temp < number){
				printf("* ");
				if(temp == number - 1){
					printf("\n");
				}
				temp++;
			}		
		}
		
		else{
			temp = 0;
			while(temp < number){
				printf(" *");
				if(temp == number - 1){
					printf("\n");
				}
				temp++;
			}
		}
		counter++;
	}
}
