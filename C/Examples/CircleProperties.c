#include<stdio.h>

int main(){
	int r;
	float pi = 3.14159;
	
	printf("Give radius: ");
	scanf("%d",&r);
	
	printf("\nCircumference: %.2f",(2*pi*r));
	printf("\nField: %.2f",(pi*r*r));
	printf("\nBig Radius: %.2f",(2.0*r));
}
