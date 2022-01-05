#include<stdio.h>

int main(){
	
	int number, counter = 0, sum = 0;
	float average;
	
	
	printf("Enter the number: "); scanf("%d",&number);
	
	while(number != 9999){
		
		sum += number;
		counter++;
		printf("Enter the number: "); scanf("%d",&number);
	}
	
	printf("Counter: %d\t Sum: %d\n",counter, sum);
	average = (float) sum / counter;
	printf("Average: %.2f",average);
}
