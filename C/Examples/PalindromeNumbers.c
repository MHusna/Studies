#include<stdio.h>

int main(){
	
	int number, temp, digit1, digit2, digit3, digit4, digit5, counter = 1;
	
	printf("Enter the number: "); scanf("%d",&number);
	
	temp = number;
	
	while(counter <= 5){
		
		if(counter == 1){
			digit1 = temp % 10;
			temp -= digit1;
			temp /= 10;
		}
		else if(counter == 2){
			digit2 = temp % 10;
			temp -= digit2;
			temp /= 10;
		}
		else if(counter == 4){
			digit4 =  temp % 10;
			temp -= digit4;
			temp /= 10;
		}
		else if(counter == 5){
			digit5 = temp % 10;
			temp -= digit5;
			temp /= 10;
		}
		else{
			digit3 = temp%10;
			temp-= digit3;
			temp/= 10;
		}
		counter++;
	}
	
	if(digit1 == digit4 && digit2 == digit5){
		printf("%d is palindrome.",number);
	}
	else{
		printf("%d is not a palindrome.",number);
	}
}
