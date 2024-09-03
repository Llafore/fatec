#include <stdio.h>
#include <stdlib.h>
#include <string.h>
 
typedef struct q{
    char pergunta[400];
    char resposta[400];
    struct q* prox;
} questao;
 
typedef struct f{
  questao* primeira;  
} fila;
 
void perguntar(fila *f){
    questao *novo = (questao*)malloc(sizeof(questao));
    printf("\nAdicionando uma nova questao na fila:");
    printf("\nPergunta: "); scanf("%s", &novo->pergunta);
    printf("\nResposta: "); scanf("%s", &novo->resposta);
    novo->prox=NULL;

    if (f->primeira == NULL){
        f->primeira = novo;
    }else{
        questao *aux = f->primeira;
        while(aux->prox!=NULL){
            aux = aux->prox;
        };
        aux->prox = novo;
    }
    printf("\nQuestao adicionada!\n\n");
};
 
void listar(fila *f){
    if(f->primeira==NULL){
        printf("\nNAO EXISTEM PERGUNTAS!");
    }else{
        questao *aux = f->primeira;
        do{
            printf("\nPergunta: %s \nResposta: %s", aux->pergunta, aux->resposta);
            aux = aux->prox;
        }while(aux!=NULL);
    }
}
 
void excluir(fila *f){
    if (f->primeira==NULL){
        printf("\nNAO EXISTEM PERGUNTAS PARA RESPONDER!");
    } else {
        questao *aux = f->primeira;
        printf("\nResposta enviada da pergunta %s, enviada",aux->pergunta);
        f->primeira = f->primeira->prox;
        free(aux);
    }
    
}
 
int main(){
    fila *f={NULL};
 
    perguntar(&f);
    perguntar(&f);
    perguntar(&f);
    listar(&f);
    excluir(&f);
    excluir(&f);
    listar(&f);
    return 0;
}