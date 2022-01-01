#include<stdio.h>

int main(){
	
	int counter, number;
	
	printf("Enter the max range: "); scanf("%d",&number);
	
	printf("\n*********** Writing ***********");
	printf("\nN\t10*N\t100*N\t1000*N\n");
	
	while(counter <= number){
		printf("\n%d\t%d\t%d\t%d",counter, (counter * 10), (counter * 100), (counter * 1000));
		counter++;
	}
}
