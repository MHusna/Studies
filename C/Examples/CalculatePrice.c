#include<stdio.h>

int main(){
	
	/* This program calculates
		the same products total price.*/
	
	int cost, count, totalPrice;
	printf("Price: ");
	scanf("%d",&cost);
	
	printf("Count: ");
	scanf("%d",&count);
	
	totalPrice = cost * count;
	printf("Total Price: %d",totalPrice);
	
	return 0;
}
