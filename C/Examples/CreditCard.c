#include<stdio.h>

int main(){
	
	int accountNumber;
	float firstBalance, totalSpent, transferredCredit, allowedCreditLimit, newBalance;
	
	printf("Account Number(-1 for exit): "); scanf("%d",&accountNumber);
	while(accountNumber != -1){
		
		printf("First Balance: "); scanf("%f",&firstBalance);
		printf("Total Spent: "); scanf("%f",&totalSpent);
		printf("Transferred Credit: "); scanf("%f",&transferredCredit);
		printf("Allowed Credit Limit: "); scanf("%f",&allowedCreditLimit);
		
		newBalance = firstBalance + totalSpent - transferredCredit; 
		
		
		printf("\n\nAccount Number: %d",accountNumber);
		printf("\nCredit Limit: %.2f",allowedCreditLimit);
		printf("\nBalance: %.2f",newBalance);
	
		if(newBalance > allowedCreditLimit)
			printf("\nCredit limit is exceeded.\n\n\n");
		
		printf("Account Number(-1 for exit): "); scanf("%d",&accountNumber);
	}
	
	
}
