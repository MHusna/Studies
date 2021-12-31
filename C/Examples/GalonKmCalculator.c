#include<stdio.h>

int main(){
	
	float galon, km, result = 1.0, total = 0.0;
	
	printf("Galon(-1 for exit): ");	scanf("%f",&galon);
	
	while(galon != -1){
		printf("Km: ");		scanf("%f",&km);
		result = km / galon;
		total += result;
		printf("Result: %.2f",result);
		
		printf("\n\n\nGalon(-1 for exit): ");	scanf("%f",&galon);
	}
	
	printf("\n\n\nTotal: %.2f",total);
}
