#include<stdio.h>
#include<stdlib.h>
#include<time.h>

int rollTheDice(void);

int main(){

	int gameStatus, total, scoreOfGamer;
	
	srand(time(NULL));
	total = rollTheDice();
	
	switch(total){
		
		case 7: case 11:
			gameStatus = 1;
			break;
		
		case 2: case 3: case 12:
			gameStatus = 2;
			break;
		
		default:
			gameStatus = 0;
			scoreOfGamer = total;
			printf("Oyuncunun kazanacaðý zar: %d\n", scoreOfGamer);
			break;
	}
	
	while(gameStatus == 0){
		total = rollTheDice();
		
		if(total == scoreOfGamer)
			gameStatus = 1;
		
		else if(total == 7)
			gameStatus = 2;
	}
	
	if(gameStatus = 1)
		printf("Oyuncu kazanýr.\n");
	else
		printf("Oyuncu kaybeder.\n");
	
	return 0;
}

int rollTheDice(void){
	
	int dice1, dice2, totalDice;
	
	dice1 = 1 + (rand() % 6);
	dice2 = 1 + (rand() % 6);
	totalDice = dice1 + dice2;
	printf("Oyuncu %d + %d = %d attý.\n",dice1, dice2, totalDice);
	return totalDice;
	
}
