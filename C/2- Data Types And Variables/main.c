#include<stdio.h>

int main(){
	
	// 	Comment line 1.
	
	/*
		Comment line 2.
	*/
	
	int var1 = 42;
	char ch1 = 66;
	char ch2 = 'B';
	float fl1 = 4.2;
	double db1 = 0.21;
	
	printf("%d %c %d %.2f %.2f\n%s\n",var1, ch1, ch2, fl1, db1, "Mehmet Husna Kisla");
	
	printf("Char: %d byte\n", sizeof(char));
	printf("Integer: %d byte\n", sizeof(int));
	printf("Short: %d byte\n", sizeof(short));
	printf("Long: %d byte\n", sizeof(long));
	printf("Float: %d byte\n", sizeof(float));
	printf("Double: %d byte\n", sizeof(double));
}
