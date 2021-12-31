#include<stdio.h>

int main(){
	
	float interestRate, baseAmount, interest;
	int interestDate;
	
	printf("Base Amount(-1 for exit): "); scanf("%f",&baseAmount);
	
	while(baseAmount != -1){
		
		printf("Interest Rate: "); scanf("%f",&interestRate);
		printf("Interest Date: "); scanf("%d",&interestDate);
		
		interest = baseAmount * interestRate * (interestDate / 365);
		printf("Interest: %.2f$",interest);
		
		printf("\nBase Amount(-1 for exit): "); scanf("%f",&baseAmount);
	}
}
