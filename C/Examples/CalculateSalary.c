#include<stdio.h>

int main(){
	
	int workHour;
	float perHourSalary, totalSalary, tempSalary;
	
	printf("Work Hour(-1 for exit): "); scanf("%d",&workHour);
	
	while(workHour != -1){
		
		printf("Per Hour Salary: "); scanf("%f",&perHourSalary);
		
		tempSalary = perHourSalary * (float) workHour;
		
		if(workHour <= 40.0)
			totalSalary = tempSalary;
		
		else{
			
			workHour -= 40;
			totalSalary = tempSalary + ((workHour * perHourSalary) / 2);
			
		}
			
		
		printf("\nTotal Salary: %.2f$",totalSalary);
		
		printf("\nWork Hour(-1 for exit): "); scanf("%d",&workHour);
	}
}
