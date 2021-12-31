#include<stdio.h>

int main(){
	
	float saleAmount, salary = 200, ninePercent;
	
	printf("Sale Amount(-1 for exit): "); scanf("%f",&saleAmount);
	
	while(saleAmount != -1){
		
		ninePercent = ((saleAmount * 9) / 100);
		salary += ninePercent;
		printf("Salary: %.2f$\n\n",salary);
		
		printf("Sale Amount(-1 for exit): "); scanf("%f",&saleAmount);
	}
	
}
