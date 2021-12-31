#include<stdio.h>

int main(){
	
	int counter = 1, total = 0;
	
	while(counter <= 10){
		
		total += counter;
		counter++;
	}
	
	printf("%d",total);
}
