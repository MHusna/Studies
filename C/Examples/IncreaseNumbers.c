#include<stdio.h>

int main(){
	
	int counter = 1, number, temp; 
	
	printf("Enter the starter number: "); scanf("%d",&number);
	printf("A\tA+2\tA+4\tA+6\n\n");
	
	while(counter <= 5){
		
		temp = number;
		temp *= counter;
		printf("\n%d\t%d\t%d\t%d",temp, (temp + 2), (temp + 4), (temp + 6));
		counter++;
	}	
}
