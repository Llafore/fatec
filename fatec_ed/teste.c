#include <stdio.h>

typedef struct conta {
    char nome[100];
    int agencia;
    int conta;
    float saldo;
    struct conta *proximo;
} Conta;

typedef struct {
    Conta *primeiro;    
} Fila;

int filaVazia(Fila *f){
    if(f->primeiro==NULL){
        printf("\nFILA VAZIA!!!!!!!!!!");
        return 1;
    } else {
        return 0;   
    }
}

void colocar(Fila *f){
    Conta *novo = (Conta*)malloc(sizeof(Conta));
    printf("\nInforme a Agencia, Conta e Saldo:");
    scanf("%i %i %f", &novo->agencia, &novo->conta, &novo->saldo);
    novo->proximo = NULL;
    if(filaVazia(f)){
        f->primeiro = novo;
    } else {
        Conta *aux = f->primeiro;
        while(aux->proximo != NULL){
            aux = aux->proximo;
        }
        aux->proximo = novo;
    }
    printf("\nConta adicionada com sucesso %x !!!", novo);
}

void remover(Fila *f){
    if(!filaVazia(f)){
        Conta *aux = f->primeiro;
        f->primeiro = aux->proximo;
        printf("\nConta removida com sucesso %x !", aux);
        free(aux);
    }     
}


void listar(Fila *f){
    if(!filaVazia(f)){
        Conta *aux = f->primeiro;
        do{
            printf("\n%x %i %i R$%f", aux, aux->agencia, aux->conta, aux->saldo);
            aux = aux->proximo;
        }while(aux!=NULL);
    }
}

int main()
{
    Fila novaFila = {NULL};

    colocar(&novaFila);
    colocar(&novaFila);
    colocar(&novaFila);
    listar(&novaFila);
    remover(&novaFila);
    listar(&novaFila);
    return 0;
}
