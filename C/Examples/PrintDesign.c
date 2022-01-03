#include<stdio.h>

int main(){
	
	int number, counter = 1, temp;
	
	printf("Enter the size of design: "); scanf("%d",&number);
	
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
