#include<stdio.h>

int main(){
	
	int binaryNumber, total = 0, digit, counter = 1, temp = 0, i;
	
	printf("Enter the binary number: "); scanf("%d",&binaryNumber);
	
	while(counter <= 8){
		
		digit = binaryNumber % 10;
		binaryNumber -= digit;
		binaryNumber /= 10;
		
		temp++;
		i = 0;
		
		while(i < temp){
			
			if(i == 0){
				digit *= 1;
			}
			else{
				digit *= 2;
			}
			i++;
		}
		
		total += digit;
		counter++;
	}
	
	printf("Decimal: %d",total);
}
