#include<stdio.h>

int main(){
	
	int number = 1;
	
	printf("N\t10*N\t100*N\t1000*N\n");
	
	while(number <= 10){
		printf("\n%d\t%d\t%d\t%d",number,(number * 10),(number * 100),(number * 1000));
		number++;
	}
}
