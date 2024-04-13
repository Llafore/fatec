#include<stdio.h>
#include<string.h>
#include<stdlib.h>

// struct amigo {
// 	char nome[60];
// 	int nota;
// 	char plataforma[30];
// };

// int main(){
// 	struct amigo vet[100];
// 	int i;
// 	for(i=0; i<2; i++)
// 	{	printf("Game %d\n", i+1);
// 		printf("Entre com o nome: ");
// 		fgets(vet[i].nome, 30, stdin);
// 		vet[i].nome[strlen(vet[i].nome)-1] = '\0';
// 		printf("Entre com a nota: ");
// 		//scanf("%d", &vet[i].telefone);
// 		//usar scanf aqui deixa um pula-linha no buffer
// 		//de teclado e atrapalha a próxima leitura
// 		char aux[15];
// 		fgets(aux, 15, stdin);
// 		vet[i].nota = atoi(aux);
// 		printf("Entre com o plataforma: ");
// 		fgets(vet[i].plataforma, 20, stdin);
// 		vet[i].plataforma[strlen(vet[i].plataforma)-1] = '\0';
// 	}
// 	for(i=0; i<2; i++)
// 	{	printf("Game %d\n", i+1);
// 		printf("Nome: %s\n", vet[i].nome);
// 		printf("Nota: %d\n", vet[i].nota);
// 		printf("plataforma: %s\n", vet[i].plataforma);
// 	}
// 	return 0;
// }














 struct jogos {
    char titulo[60];
    char plataforma[15];
    int nota;
};

int main() {
    struct jogos vet[100];
    int i;
    char aux[2];

    for (i=0;i<2;i++){
        printf("Game %d", i+1);
        // nome do game :
        printf("    Nome do jogo: ");
        fgets(vet[i].titulo,60,stdin);
        vet[i].titulo[strlen(vet[i].titulo)-1] = '\0';
        // plataforma do game :
        printf("    Console do jogo: ");
        fgets(vet[i].plataforma ,15,stdin);
        vet[i].plataforma [strlen(vet[i].plataforma )-1] = '\0';
        // nota do metacric
        printf("    Nota Metacritc: ");
        fgets(aux,2,stdin);
        vet[i].nota = atoi(aux);
    }

    for (i=0;i>2;i++){
        printf("Atributos do %dº jogo: \n", i+1);
        printf("    Titulo: %s    Console: %s    Nota: %d", vet[i].titulo, vet[i].plataforma,vet[i].nota);
    } 
    
    return 0; 
}