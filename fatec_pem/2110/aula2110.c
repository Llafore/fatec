#include<stdio.h>
#include<string.h>
#include<stdlib.h>

struct amigo {
	char nome[60];
	long int telefone;
	char email[30];
};

int main(){
	struct amigo vet[100];
	int i;
	for(i=0; i<5; i++)
	{	printf("FICHA %d\n", i+1);
		printf("Entre com o nome: ");
		fgets(vet[i].nome, 30, stdin);
		vet[i].nome[strlen(vet[i].nome)-1] = '\0';
		printf("Entre com o telefone: ");
		//scanf("%d", &vet[i].telefone);
		//usar scanf aqui deixa um pula-linha no buffer
		//de teclado e atrapalha a próxima leitura
		char aux[15];
		fgets(aux, 15, stdin);
		vet[i].telefone = atoi(aux);
		printf("Entre com o e-mail: ");
		fgets(vet[i].email, 20, stdin);
		vet[i].email[strlen(vet[i].email)-1] = '\0';
	}
	for(i=0; i<5; i++)
	{	printf("FICHA %d\n", i+1);
		printf("Nome: %s\n", vet[i].nome);
		printf("Telefone: %ld\n", vet[i].telefone);
		printf("E-mail: %s\n", vet[i].email);
	}
	return 0;
}



//  NUMERO PALINDOMO


// bool palindrome(char n[ ], int inicio, int fim){
//     if(inicio == fim) return true; //um dígito

//     else if(fim - inicio == 1){  //dois dígitos   
//     if(n[inicio] == n[fim]) return true;  //dois dígitos iguais
//         else return false;  //dois dígitos diferentes
//     }
//     else return (n[inicio] == n[fim] && palindrome(n, inicio+1, fim-1));
// }

// int main()
// {	char numero[30];

// 	printf("Entre com um numero: ");
// 	scanf("%s", numero);

// 	if(palindrome(numero, 0, strlen(numero)-1)) printf("Palindrome");
// 	else printf("Nao palíndrome");

// 	return 0;

// }



// POTENCIA

//  int potencia(int base, int pot){
//     if (pot == 0) return 1;
//     else return base * base * potencia(base, (pot -1));     
// }

// int main(){
//     int n1=3, n2=2 , result;
//     result = potencia(n1,n2);
//     printf("%d", result);
//     return 0;
// }