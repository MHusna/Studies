#include<stdio.h>

int main(){
	
	int var1 = 10;
	int var2 = -2;
	
	printf("Variable 1: %d     Variable 2: %d\n",var1,var2);
	printf("Reverse 1: %d     Reverse  2: %d",-var1,-var2);
	int result = var1 + var2;
	printf("\nSum: %d",result);
	
	result = var1 - var2;
	printf("\nSubstract: %d",result);
	
	result = var1 * var2;
	printf("\nMultiply: %d",result);	
	
	result = var1 / var2;
	printf("\nDivide: %d",result);	
	
	result = var1 % var2;
	printf("\nMod: %d",result);	
}
