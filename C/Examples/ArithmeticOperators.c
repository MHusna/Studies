#include<stdio.h>

int main(){
	
	int var1, var2, result;
	printf("Variable 1: "); scanf("%d",&var1);
	printf("Variable 2: "); scanf("%d",&var2);
	
	
	result = var1 + var2;
	printf("\n%d + %d: %d",var1,var2,result);
	
	result = var1 - var2;
	printf("\n%d - %d: %d",var1,var2,result);
	
	result = var1 * var2;
	printf("\n%d + %d: %d",var1,var2,result);
	
	result = var1 / var2;
	printf("\n%d / %d: %d",var1,var2,result);
	
	result = var1 % var2;
	printf("\nmod: %d",result);
}
