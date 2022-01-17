#include<stdio.h>

int main(){
	
	int accountID, currentCreditLimit;
	float newCreditLimit;
	
	printf("Enter the Account Number: "); scanf("%d", &accountID);
	printf("Enter the Current Credit Limit: "); scanf("%d", &currentCreditLimit);
	
	newCreditLimit = (float) currentCreditLimit / 2;
	
	printf("Your new credit limit: %.2f",newCreditLimit);
}
