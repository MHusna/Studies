#include<stdio.h>

int main(){
	
	int counter = 0, total = 0, temp;
	float average;
	
	printf("Score: ");
	scanf("%d",&temp);
	
	while(temp != -1){
		total += temp;
		printf("Score: ");
		scanf("%d",&temp);
		counter++;
	}
	
	if(counter != 0){
		average = (float) total / counter;
		printf("Average: %.2f",average);
	}
	else
		printf("You did not enter the any score.");
}
